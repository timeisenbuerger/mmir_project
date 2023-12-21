# DefaultApi

All URIs are relative to *http://85.215.58.111:8242/gmaf/gmafApi/gmaf*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAuthToken**](DefaultApi.md#getAuthToken) | **GET** /gmaf/getToken/{api-key} |  |
| [**getAuthToken1**](DefaultApi.md#getAuthToken1) | **GET** /api/getAuthToken |  |
| [**getCollection**](DefaultApi.md#getCollection) | **POST** /gmaf/getCollection/{auth-token} |  |
| [**getCollectionIds**](DefaultApi.md#getCollectionIds) | **POST** /gmaf/get-collection-ids/{auth-token} |  |
| [**getCollectionMetadata**](DefaultApi.md#getCollectionMetadata) | **POST** /gmaf/getMetadata/{auth-token} |  |
| [**getExternalGrammar**](DefaultApi.md#getExternalGrammar) | **GET** /application.wadl/{path} |  |
| [**getImage**](DefaultApi.md#getImage) | **GET** /gmaf/preview/{auth-token}/{id} |  |
| [**getMMFGForId**](DefaultApi.md#getMMFGForId) | **POST** /gmaf/getmmfg/{auth-token}/{mmfg-id} |  |
| [**getOrGenerateGraphCode**](DefaultApi.md#getOrGenerateGraphCode) | **POST** /gmaf/getgc/{auth-token}/{mmfg_id} |  |
| [**getPreviewURL**](DefaultApi.md#getPreviewURL) | **POST** /gmaf/preview/{auth-token}/{id} |  |
| [**getRecommendedAssets**](DefaultApi.md#getRecommendedAssets) | **POST** /gmaf/getRec/{auth-token}/{id} |  |
| [**getSession**](DefaultApi.md#getSession) | **POST** /gmaf/{session}/{api-key} |  |
| [**getSimilarAssetIDsByGraphCode**](DefaultApi.md#getSimilarAssetIDsByGraphCode) | **POST** /gmaf/getsimilarassetsbygraphcode/{auth-token} |  |
| [**getSimilarAssets**](DefaultApi.md#getSimilarAssets) | **POST** /gmaf/getSim/{auth-token}/{id} |  |
| [**getWadl**](DefaultApi.md#getWadl) | **GET** /application.wadl |  |
| [**queryByKeyword**](DefaultApi.md#queryByKeyword) | **POST** /gmaf/query/{auth-token}/{query} |  |
| [**setProcessingPlugins**](DefaultApi.md#setProcessingPlugins) | **GET** /api |  |


<a id="getAuthToken"></a>
# **getAuthToken**
> String getAuthToken(apiKey)



### Example
```java
// Import classes:
import de.tei.mmir.gmaf.invoker.ApiClient;
import de.tei.mmir.gmaf.invoker.ApiException;
import de.tei.mmir.gmaf.invoker.Configuration;
import de.tei.mmir.gmaf.invoker.models.*;
import de.tei.mmir.gmaf.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://85.215.58.111:8242/gmaf/gmafApi/gmaf");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String apiKey = "apiKey_example"; // String | 
    try {
      String result = apiInstance.getAuthToken(apiKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getAuthToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiKey** | **String**|  | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="getAuthToken1"></a>
# **getAuthToken1**
> String getAuthToken1()



### Example
```java
// Import classes:
import de.tei.mmir.gmaf.invoker.ApiClient;
import de.tei.mmir.gmaf.invoker.ApiException;
import de.tei.mmir.gmaf.invoker.Configuration;
import de.tei.mmir.gmaf.invoker.models.*;
import de.tei.mmir.gmaf.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://85.215.58.111:8242/gmaf/gmafApi/gmaf");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      String result = apiInstance.getAuthToken1();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getAuthToken1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="getCollection"></a>
# **getCollection**
> List&lt;MMFG&gt; getCollection(authToken)



### Example
```java
// Import classes:
import de.tei.mmir.gmaf.invoker.ApiClient;
import de.tei.mmir.gmaf.invoker.ApiException;
import de.tei.mmir.gmaf.invoker.Configuration;
import de.tei.mmir.gmaf.invoker.models.*;
import de.tei.mmir.gmaf.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://85.215.58.111:8242/gmaf/gmafApi/gmaf");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String authToken = "authToken_example"; // String | 
    try {
      List<MMFG> result = apiInstance.getCollection(authToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getCollection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authToken** | **String**|  | |

### Return type

[**List&lt;MMFG&gt;**](MMFG.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="getCollectionIds"></a>
# **getCollectionIds**
> List&lt;String&gt; getCollectionIds(authToken)



### Example
```java
// Import classes:
import de.tei.mmir.gmaf.invoker.ApiClient;
import de.tei.mmir.gmaf.invoker.ApiException;
import de.tei.mmir.gmaf.invoker.Configuration;
import de.tei.mmir.gmaf.invoker.models.*;
import de.tei.mmir.gmaf.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://85.215.58.111:8242/gmaf/gmafApi/gmaf");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String authToken = "authToken_example"; // String | 
    try {
      List<String> result = apiInstance.getCollectionIds(authToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getCollectionIds");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authToken** | **String**|  | |

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="getCollectionMetadata"></a>
# **getCollectionMetadata**
> List&lt;GeneralMetadata&gt; getCollectionMetadata(authToken)



### Example
```java
// Import classes:
import de.tei.mmir.gmaf.invoker.ApiClient;
import de.tei.mmir.gmaf.invoker.ApiException;
import de.tei.mmir.gmaf.invoker.Configuration;
import de.tei.mmir.gmaf.invoker.models.*;
import de.tei.mmir.gmaf.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://85.215.58.111:8242/gmaf/gmafApi/gmaf");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String authToken = "authToken_example"; // String | 
    try {
      List<GeneralMetadata> result = apiInstance.getCollectionMetadata(authToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getCollectionMetadata");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authToken** | **String**|  | |

### Return type

[**List&lt;GeneralMetadata&gt;**](GeneralMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="getExternalGrammar"></a>
# **getExternalGrammar**
> getExternalGrammar(path)



### Example
```java
// Import classes:
import de.tei.mmir.gmaf.invoker.ApiClient;
import de.tei.mmir.gmaf.invoker.ApiException;
import de.tei.mmir.gmaf.invoker.Configuration;
import de.tei.mmir.gmaf.invoker.models.*;
import de.tei.mmir.gmaf.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://85.215.58.111:8242/gmaf/gmafApi/gmaf");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String path = "path_example"; // String | 
    try {
      apiInstance.getExternalGrammar(path);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getExternalGrammar");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **path** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="getImage"></a>
# **getImage**
> getImage(authToken, id)



### Example
```java
// Import classes:
import de.tei.mmir.gmaf.invoker.ApiClient;
import de.tei.mmir.gmaf.invoker.ApiException;
import de.tei.mmir.gmaf.invoker.Configuration;
import de.tei.mmir.gmaf.invoker.models.*;
import de.tei.mmir.gmaf.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://85.215.58.111:8242/gmaf/gmafApi/gmaf");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String authToken = "authToken_example"; // String | 
    String id = "id_example"; // String | 
    try {
      apiInstance.getImage(authToken, id);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getImage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authToken** | **String**|  | |
| **id** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="getMMFGForId"></a>
# **getMMFGForId**
> MMFG getMMFGForId(authToken, mmfgId)



### Example
```java
// Import classes:
import de.tei.mmir.gmaf.invoker.ApiClient;
import de.tei.mmir.gmaf.invoker.ApiException;
import de.tei.mmir.gmaf.invoker.Configuration;
import de.tei.mmir.gmaf.invoker.models.*;
import de.tei.mmir.gmaf.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://85.215.58.111:8242/gmaf/gmafApi/gmaf");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String authToken = "authToken_example"; // String | 
    String mmfgId = "mmfgId_example"; // String | 
    try {
      MMFG result = apiInstance.getMMFGForId(authToken, mmfgId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getMMFGForId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authToken** | **String**|  | |
| **mmfgId** | **String**|  | |

### Return type

[**MMFG**](MMFG.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="getOrGenerateGraphCode"></a>
# **getOrGenerateGraphCode**
> String getOrGenerateGraphCode(authToken, mmfgId)



### Example
```java
// Import classes:
import de.tei.mmir.gmaf.invoker.ApiClient;
import de.tei.mmir.gmaf.invoker.ApiException;
import de.tei.mmir.gmaf.invoker.Configuration;
import de.tei.mmir.gmaf.invoker.models.*;
import de.tei.mmir.gmaf.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://85.215.58.111:8242/gmaf/gmafApi/gmaf");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String authToken = "authToken_example"; // String | 
    String mmfgId = "mmfgId_example"; // String | 
    try {
      String result = apiInstance.getOrGenerateGraphCode(authToken, mmfgId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getOrGenerateGraphCode");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authToken** | **String**|  | |
| **mmfgId** | **String**|  | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="getPreviewURL"></a>
# **getPreviewURL**
> String getPreviewURL(authToken, id)



### Example
```java
// Import classes:
import de.tei.mmir.gmaf.invoker.ApiClient;
import de.tei.mmir.gmaf.invoker.ApiException;
import de.tei.mmir.gmaf.invoker.Configuration;
import de.tei.mmir.gmaf.invoker.models.*;
import de.tei.mmir.gmaf.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://85.215.58.111:8242/gmaf/gmafApi/gmaf");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String authToken = "authToken_example"; // String | 
    String id = "id_example"; // String | 
    try {
      String result = apiInstance.getPreviewURL(authToken, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getPreviewURL");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authToken** | **String**|  | |
| **id** | **String**|  | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="getRecommendedAssets"></a>
# **getRecommendedAssets**
> List&lt;MMFG&gt; getRecommendedAssets(authToken, id)



### Example
```java
// Import classes:
import de.tei.mmir.gmaf.invoker.ApiClient;
import de.tei.mmir.gmaf.invoker.ApiException;
import de.tei.mmir.gmaf.invoker.Configuration;
import de.tei.mmir.gmaf.invoker.models.*;
import de.tei.mmir.gmaf.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://85.215.58.111:8242/gmaf/gmafApi/gmaf");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String authToken = "authToken_example"; // String | 
    String id = "id_example"; // String | 
    try {
      List<MMFG> result = apiInstance.getRecommendedAssets(authToken, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getRecommendedAssets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authToken** | **String**|  | |
| **id** | **String**|  | |

### Return type

[**List&lt;MMFG&gt;**](MMFG.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="getSession"></a>
# **getSession**
> GMAF getSession(session, apiKey)



### Example
```java
// Import classes:
import de.tei.mmir.gmaf.invoker.ApiClient;
import de.tei.mmir.gmaf.invoker.ApiException;
import de.tei.mmir.gmaf.invoker.Configuration;
import de.tei.mmir.gmaf.invoker.models.*;
import de.tei.mmir.gmaf.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://85.215.58.111:8242/gmaf/gmafApi/gmaf");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String session = "session_example"; // String | 
    String apiKey = "apiKey_example"; // String | 
    try {
      GMAF result = apiInstance.getSession(session, apiKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getSession");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **session** | **String**|  | |
| **apiKey** | **String**|  | |

### Return type

[**GMAF**](GMAF.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="getSimilarAssetIDsByGraphCode"></a>
# **getSimilarAssetIDsByGraphCode**
> List&lt;String&gt; getSimilarAssetIDsByGraphCode(authToken, body)



### Example
```java
// Import classes:
import de.tei.mmir.gmaf.invoker.ApiClient;
import de.tei.mmir.gmaf.invoker.ApiException;
import de.tei.mmir.gmaf.invoker.Configuration;
import de.tei.mmir.gmaf.invoker.models.*;
import de.tei.mmir.gmaf.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://85.215.58.111:8242/gmaf/gmafApi/gmaf");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String authToken = "authToken_example"; // String | 
    String body = "body_example"; // String | 
    try {
      List<String> result = apiInstance.getSimilarAssetIDsByGraphCode(authToken, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getSimilarAssetIDsByGraphCode");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authToken** | **String**|  | |
| **body** | **String**|  | [optional] |

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="getSimilarAssets"></a>
# **getSimilarAssets**
> List&lt;MMFG&gt; getSimilarAssets(authToken, id)



### Example
```java
// Import classes:
import de.tei.mmir.gmaf.invoker.ApiClient;
import de.tei.mmir.gmaf.invoker.ApiException;
import de.tei.mmir.gmaf.invoker.Configuration;
import de.tei.mmir.gmaf.invoker.models.*;
import de.tei.mmir.gmaf.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://85.215.58.111:8242/gmaf/gmafApi/gmaf");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String authToken = "authToken_example"; // String | 
    String id = "id_example"; // String | 
    try {
      List<MMFG> result = apiInstance.getSimilarAssets(authToken, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getSimilarAssets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authToken** | **String**|  | |
| **id** | **String**|  | |

### Return type

[**List&lt;MMFG&gt;**](MMFG.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="getWadl"></a>
# **getWadl**
> getWadl()



### Example
```java
// Import classes:
import de.tei.mmir.gmaf.invoker.ApiClient;
import de.tei.mmir.gmaf.invoker.ApiException;
import de.tei.mmir.gmaf.invoker.Configuration;
import de.tei.mmir.gmaf.invoker.models.*;
import de.tei.mmir.gmaf.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://85.215.58.111:8242/gmaf/gmafApi/gmaf");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      apiInstance.getWadl();
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getWadl");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.sun.wadl+xml, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="queryByKeyword"></a>
# **queryByKeyword**
> List&lt;String&gt; queryByKeyword(authToken, query)



### Example
```java
// Import classes:
import de.tei.mmir.gmaf.invoker.ApiClient;
import de.tei.mmir.gmaf.invoker.ApiException;
import de.tei.mmir.gmaf.invoker.Configuration;
import de.tei.mmir.gmaf.invoker.models.*;
import de.tei.mmir.gmaf.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://85.215.58.111:8242/gmaf/gmafApi/gmaf");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String authToken = "authToken_example"; // String | 
    String query = "query_example"; // String | 
    try {
      List<String> result = apiInstance.queryByKeyword(authToken, query);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#queryByKeyword");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authToken** | **String**|  | |
| **query** | **String**|  | |

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="setProcessingPlugins"></a>
# **setProcessingPlugins**
> setProcessingPlugins()



### Example
```java
// Import classes:
import de.tei.mmir.gmaf.invoker.ApiClient;
import de.tei.mmir.gmaf.invoker.ApiException;
import de.tei.mmir.gmaf.invoker.Configuration;
import de.tei.mmir.gmaf.invoker.models.*;
import de.tei.mmir.gmaf.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://85.215.58.111:8242/gmaf/gmafApi/gmaf");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      apiInstance.setProcessingPlugins();
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#setProcessingPlugins");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

