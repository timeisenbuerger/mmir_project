package de.tei.mmir.gmaf.util;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class UnixTimestampAdapter extends TypeAdapter<OffsetDateTime> {

    @Override
    public void write(JsonWriter out, OffsetDateTime value) throws IOException {
        if (value == null) {
            out.nullValue();
            return;
        }
        Instant instant = Instant.ofEpochMilli(value.toEpochSecond());
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.UTC);
        out.value(offsetDateTime.toEpochSecond());
    }

    @Override
    public OffsetDateTime read(JsonReader in) throws IOException {
        if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
        }
        Instant instant = Instant.ofEpochMilli(in.nextLong());
        return instant.atOffset(ZoneOffset.UTC);
    }

}