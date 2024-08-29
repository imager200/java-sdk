# CompressApi

All URIs are relative to *https://api.imager200.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**compressAsyncGet**](CompressApi.md#compressAsyncGet) | **GET** /compress |  |
| [**compressAsyncGetWithHttpInfo**](CompressApi.md#compressAsyncGetWithHttpInfo) | **GET** /compress |  |
| [**compressAsyncPost**](CompressApi.md#compressAsyncPost) | **POST** /compress |  |
| [**compressAsyncPostWithHttpInfo**](CompressApi.md#compressAsyncPostWithHttpInfo) | **POST** /compress |  |
| [**compressSyncGet**](CompressApi.md#compressSyncGet) | **GET** /compress/sync |  |
| [**compressSyncGetWithHttpInfo**](CompressApi.md#compressSyncGetWithHttpInfo) | **GET** /compress/sync |  |
| [**compressSyncPost**](CompressApi.md#compressSyncPost) | **POST** /compress/sync |  |
| [**compressSyncPostWithHttpInfo**](CompressApi.md#compressSyncPostWithHttpInfo) | **POST** /compress/sync |  |



## compressAsyncGet

> InfoResponse compressAsyncGet(url, jpegQuality, pngOptimizationLevel, progressiveJpeg)



This endpoint compresses the image according to the parameters.

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.CompressApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        CompressApi apiInstance = new CompressApi(defaultClient);
        String url = "url_example"; // String | image url, supported formats jpeg,png
        Integer jpegQuality = 95; // Integer | defines the jpeg quality level (the higher is the value, the better quality of the image). Only applied if the image is of type jpeg. (uses MozJPEG behind the curtains)
        Integer pngOptimizationLevel = 3; // Integer | defines the png optimization level (higher value means a smaller size and longer compression time). Only applied if image is of type png.
        Boolean progressiveJpeg = true; // Boolean | It toggles the generation of a progressive JPEG. A \"false\" value generates a baseline JPEG
        try {
            InfoResponse result = apiInstance.compressAsyncGet(url, jpegQuality, pngOptimizationLevel, progressiveJpeg);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompressApi#compressAsyncGet");
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
| **url** | **String**| image url, supported formats jpeg,png | |
| **jpegQuality** | **Integer**| defines the jpeg quality level (the higher is the value, the better quality of the image). Only applied if the image is of type jpeg. (uses MozJPEG behind the curtains) | [optional] [default to 95] |
| **pngOptimizationLevel** | **Integer**| defines the png optimization level (higher value means a smaller size and longer compression time). Only applied if image is of type png. | [optional] [default to 3] |
| **progressiveJpeg** | **Boolean**| It toggles the generation of a progressive JPEG. A \&quot;false\&quot; value generates a baseline JPEG | [optional] [default to true] |

### Return type

[**InfoResponse**](InfoResponse.md)


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  * Location - the temporary url of an image in case a post operation id is not provided <br>  |
| **400** | Bad Request |  -  |

## compressAsyncGetWithHttpInfo

> ApiResponse<InfoResponse> compressAsyncGet compressAsyncGetWithHttpInfo(url, jpegQuality, pngOptimizationLevel, progressiveJpeg)



This endpoint compresses the image according to the parameters.

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.ApiResponse;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.CompressApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        CompressApi apiInstance = new CompressApi(defaultClient);
        String url = "url_example"; // String | image url, supported formats jpeg,png
        Integer jpegQuality = 95; // Integer | defines the jpeg quality level (the higher is the value, the better quality of the image). Only applied if the image is of type jpeg. (uses MozJPEG behind the curtains)
        Integer pngOptimizationLevel = 3; // Integer | defines the png optimization level (higher value means a smaller size and longer compression time). Only applied if image is of type png.
        Boolean progressiveJpeg = true; // Boolean | It toggles the generation of a progressive JPEG. A \"false\" value generates a baseline JPEG
        try {
            ApiResponse<InfoResponse> response = apiInstance.compressAsyncGetWithHttpInfo(url, jpegQuality, pngOptimizationLevel, progressiveJpeg);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CompressApi#compressAsyncGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **url** | **String**| image url, supported formats jpeg,png | |
| **jpegQuality** | **Integer**| defines the jpeg quality level (the higher is the value, the better quality of the image). Only applied if the image is of type jpeg. (uses MozJPEG behind the curtains) | [optional] [default to 95] |
| **pngOptimizationLevel** | **Integer**| defines the png optimization level (higher value means a smaller size and longer compression time). Only applied if image is of type png. | [optional] [default to 3] |
| **progressiveJpeg** | **Boolean**| It toggles the generation of a progressive JPEG. A \&quot;false\&quot; value generates a baseline JPEG | [optional] [default to true] |

### Return type

ApiResponse<[**InfoResponse**](InfoResponse.md)>


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  * Location - the temporary url of an image in case a post operation id is not provided <br>  |
| **400** | Bad Request |  -  |


## compressAsyncPost

> InfoResponse compressAsyncPost(compressAsyncPostRequest, jpegQuality, pngOptimizationLevel, progressiveJpeg)



This endpoint compresses the image according to the parameters.

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.CompressApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        CompressApi apiInstance = new CompressApi(defaultClient);
        CompressAsyncPostRequest compressAsyncPostRequest = new CompressAsyncPostRequest(); // CompressAsyncPostRequest | 
        Integer jpegQuality = 95; // Integer | defines the jpeg quality level (the higher is the value, the better quality of the image). Only applied if the image is of type jpeg. (uses MozJPEG behind the curtains)
        Integer pngOptimizationLevel = 3; // Integer | defines the png optimization level (higher value means a smaller size and longer compression time). Only applied if image is of type png.
        Boolean progressiveJpeg = true; // Boolean | It toggles the generation of a progressive JPEG. A \"false\" value generates a baseline JPEG
        try {
            InfoResponse result = apiInstance.compressAsyncPost(compressAsyncPostRequest, jpegQuality, pngOptimizationLevel, progressiveJpeg);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompressApi#compressAsyncPost");
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
| **compressAsyncPostRequest** | [**CompressAsyncPostRequest**](CompressAsyncPostRequest.md)|  | |
| **jpegQuality** | **Integer**| defines the jpeg quality level (the higher is the value, the better quality of the image). Only applied if the image is of type jpeg. (uses MozJPEG behind the curtains) | [optional] [default to 95] |
| **pngOptimizationLevel** | **Integer**| defines the png optimization level (higher value means a smaller size and longer compression time). Only applied if image is of type png. | [optional] [default to 3] |
| **progressiveJpeg** | **Boolean**| It toggles the generation of a progressive JPEG. A \&quot;false\&quot; value generates a baseline JPEG | [optional] [default to true] |

### Return type

[**InfoResponse**](InfoResponse.md)


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/octet-stream
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  * Location - the temporary url of an image in case a post operation id is not provided <br>  |
| **400** | Bad Request |  -  |

## compressAsyncPostWithHttpInfo

> ApiResponse<InfoResponse> compressAsyncPost compressAsyncPostWithHttpInfo(compressAsyncPostRequest, jpegQuality, pngOptimizationLevel, progressiveJpeg)



This endpoint compresses the image according to the parameters.

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.ApiResponse;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.CompressApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        CompressApi apiInstance = new CompressApi(defaultClient);
        CompressAsyncPostRequest compressAsyncPostRequest = new CompressAsyncPostRequest(); // CompressAsyncPostRequest | 
        Integer jpegQuality = 95; // Integer | defines the jpeg quality level (the higher is the value, the better quality of the image). Only applied if the image is of type jpeg. (uses MozJPEG behind the curtains)
        Integer pngOptimizationLevel = 3; // Integer | defines the png optimization level (higher value means a smaller size and longer compression time). Only applied if image is of type png.
        Boolean progressiveJpeg = true; // Boolean | It toggles the generation of a progressive JPEG. A \"false\" value generates a baseline JPEG
        try {
            ApiResponse<InfoResponse> response = apiInstance.compressAsyncPostWithHttpInfo(compressAsyncPostRequest, jpegQuality, pngOptimizationLevel, progressiveJpeg);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CompressApi#compressAsyncPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **compressAsyncPostRequest** | [**CompressAsyncPostRequest**](CompressAsyncPostRequest.md)|  | |
| **jpegQuality** | **Integer**| defines the jpeg quality level (the higher is the value, the better quality of the image). Only applied if the image is of type jpeg. (uses MozJPEG behind the curtains) | [optional] [default to 95] |
| **pngOptimizationLevel** | **Integer**| defines the png optimization level (higher value means a smaller size and longer compression time). Only applied if image is of type png. | [optional] [default to 3] |
| **progressiveJpeg** | **Boolean**| It toggles the generation of a progressive JPEG. A \&quot;false\&quot; value generates a baseline JPEG | [optional] [default to true] |

### Return type

ApiResponse<[**InfoResponse**](InfoResponse.md)>


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/octet-stream
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  * Location - the temporary url of an image in case a post operation id is not provided <br>  |
| **400** | Bad Request |  -  |


## compressSyncGet

> File compressSyncGet(url, jpegQuality, pngOptimizationLevel, progressiveJpeg)



This endpoint compresses the image according to the parameters.

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.CompressApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        CompressApi apiInstance = new CompressApi(defaultClient);
        String url = "url_example"; // String | image url, supported formats jpeg,png
        Integer jpegQuality = 95; // Integer | defines the jpeg quality level (the higher is the value, the better quality of the image). Only applied if the image is of type jpeg. (uses MozJPEG behind the curtains)
        Integer pngOptimizationLevel = 3; // Integer | defines the png optimization level (higher value means a smaller size and longer compression time). Only applied if image is of type png.
        Boolean progressiveJpeg = true; // Boolean | It toggles the generation of a progressive JPEG. A \"false\" value generates a baseline JPEG
        try {
            File result = apiInstance.compressSyncGet(url, jpegQuality, pngOptimizationLevel, progressiveJpeg);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompressApi#compressSyncGet");
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
| **url** | **String**| image url, supported formats jpeg,png | |
| **jpegQuality** | **Integer**| defines the jpeg quality level (the higher is the value, the better quality of the image). Only applied if the image is of type jpeg. (uses MozJPEG behind the curtains) | [optional] [default to 95] |
| **pngOptimizationLevel** | **Integer**| defines the png optimization level (higher value means a smaller size and longer compression time). Only applied if image is of type png. | [optional] [default to 3] |
| **progressiveJpeg** | **Boolean**| It toggles the generation of a progressive JPEG. A \&quot;false\&quot; value generates a baseline JPEG | [optional] [default to true] |

### Return type

[**File**](File.md)


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: image/jpeg, image/png, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response contains the image file |  -  |
| **400** | Bad Request |  -  |

## compressSyncGetWithHttpInfo

> ApiResponse<File> compressSyncGet compressSyncGetWithHttpInfo(url, jpegQuality, pngOptimizationLevel, progressiveJpeg)



This endpoint compresses the image according to the parameters.

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.ApiResponse;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.CompressApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        CompressApi apiInstance = new CompressApi(defaultClient);
        String url = "url_example"; // String | image url, supported formats jpeg,png
        Integer jpegQuality = 95; // Integer | defines the jpeg quality level (the higher is the value, the better quality of the image). Only applied if the image is of type jpeg. (uses MozJPEG behind the curtains)
        Integer pngOptimizationLevel = 3; // Integer | defines the png optimization level (higher value means a smaller size and longer compression time). Only applied if image is of type png.
        Boolean progressiveJpeg = true; // Boolean | It toggles the generation of a progressive JPEG. A \"false\" value generates a baseline JPEG
        try {
            ApiResponse<File> response = apiInstance.compressSyncGetWithHttpInfo(url, jpegQuality, pngOptimizationLevel, progressiveJpeg);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CompressApi#compressSyncGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **url** | **String**| image url, supported formats jpeg,png | |
| **jpegQuality** | **Integer**| defines the jpeg quality level (the higher is the value, the better quality of the image). Only applied if the image is of type jpeg. (uses MozJPEG behind the curtains) | [optional] [default to 95] |
| **pngOptimizationLevel** | **Integer**| defines the png optimization level (higher value means a smaller size and longer compression time). Only applied if image is of type png. | [optional] [default to 3] |
| **progressiveJpeg** | **Boolean**| It toggles the generation of a progressive JPEG. A \&quot;false\&quot; value generates a baseline JPEG | [optional] [default to true] |

### Return type

ApiResponse<[**File**](File.md)>


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: image/jpeg, image/png, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response contains the image file |  -  |
| **400** | Bad Request |  -  |


## compressSyncPost

> File compressSyncPost(compressAsyncPostRequest, jpegQuality, pngOptimizationLevel, progressiveJpeg)



This endpoint compresses the image according to the parameters.

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.CompressApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        CompressApi apiInstance = new CompressApi(defaultClient);
        CompressAsyncPostRequest compressAsyncPostRequest = new CompressAsyncPostRequest(); // CompressAsyncPostRequest | 
        Integer jpegQuality = 95; // Integer | defines the jpeg quality level (the higher is the value, the better quality of the image). Only applied if the image is of type jpeg. (uses MozJPEG behind the curtains)
        Integer pngOptimizationLevel = 3; // Integer | defines the png optimization level (higher value means a smaller size and longer compression time). Only applied if image is of type png.
        Boolean progressiveJpeg = true; // Boolean | It toggles the generation of a progressive JPEG. A \"false\" value generates a baseline JPEG
        try {
            File result = apiInstance.compressSyncPost(compressAsyncPostRequest, jpegQuality, pngOptimizationLevel, progressiveJpeg);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompressApi#compressSyncPost");
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
| **compressAsyncPostRequest** | [**CompressAsyncPostRequest**](CompressAsyncPostRequest.md)|  | |
| **jpegQuality** | **Integer**| defines the jpeg quality level (the higher is the value, the better quality of the image). Only applied if the image is of type jpeg. (uses MozJPEG behind the curtains) | [optional] [default to 95] |
| **pngOptimizationLevel** | **Integer**| defines the png optimization level (higher value means a smaller size and longer compression time). Only applied if image is of type png. | [optional] [default to 3] |
| **progressiveJpeg** | **Boolean**| It toggles the generation of a progressive JPEG. A \&quot;false\&quot; value generates a baseline JPEG | [optional] [default to true] |

### Return type

[**File**](File.md)


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/octet-stream
- **Accept**: image/jpeg, image/png, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response contains the image file |  -  |
| **400** | Bad Request |  -  |

## compressSyncPostWithHttpInfo

> ApiResponse<File> compressSyncPost compressSyncPostWithHttpInfo(compressAsyncPostRequest, jpegQuality, pngOptimizationLevel, progressiveJpeg)



This endpoint compresses the image according to the parameters.

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.ApiResponse;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.CompressApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        CompressApi apiInstance = new CompressApi(defaultClient);
        CompressAsyncPostRequest compressAsyncPostRequest = new CompressAsyncPostRequest(); // CompressAsyncPostRequest | 
        Integer jpegQuality = 95; // Integer | defines the jpeg quality level (the higher is the value, the better quality of the image). Only applied if the image is of type jpeg. (uses MozJPEG behind the curtains)
        Integer pngOptimizationLevel = 3; // Integer | defines the png optimization level (higher value means a smaller size and longer compression time). Only applied if image is of type png.
        Boolean progressiveJpeg = true; // Boolean | It toggles the generation of a progressive JPEG. A \"false\" value generates a baseline JPEG
        try {
            ApiResponse<File> response = apiInstance.compressSyncPostWithHttpInfo(compressAsyncPostRequest, jpegQuality, pngOptimizationLevel, progressiveJpeg);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CompressApi#compressSyncPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **compressAsyncPostRequest** | [**CompressAsyncPostRequest**](CompressAsyncPostRequest.md)|  | |
| **jpegQuality** | **Integer**| defines the jpeg quality level (the higher is the value, the better quality of the image). Only applied if the image is of type jpeg. (uses MozJPEG behind the curtains) | [optional] [default to 95] |
| **pngOptimizationLevel** | **Integer**| defines the png optimization level (higher value means a smaller size and longer compression time). Only applied if image is of type png. | [optional] [default to 3] |
| **progressiveJpeg** | **Boolean**| It toggles the generation of a progressive JPEG. A \&quot;false\&quot; value generates a baseline JPEG | [optional] [default to true] |

### Return type

ApiResponse<[**File**](File.md)>


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/octet-stream
- **Accept**: image/jpeg, image/png, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response contains the image file |  -  |
| **400** | Bad Request |  -  |

