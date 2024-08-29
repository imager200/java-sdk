# ConvertApi

All URIs are relative to *https://api.imager200.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**convertAsyncGet**](ConvertApi.md#convertAsyncGet) | **GET** /convert |  |
| [**convertAsyncGetWithHttpInfo**](ConvertApi.md#convertAsyncGetWithHttpInfo) | **GET** /convert |  |
| [**convertAsyncPost**](ConvertApi.md#convertAsyncPost) | **POST** /convert |  |
| [**convertAsyncPostWithHttpInfo**](ConvertApi.md#convertAsyncPostWithHttpInfo) | **POST** /convert |  |
| [**convertSyncGet**](ConvertApi.md#convertSyncGet) | **GET** /convert/sync |  |
| [**convertSyncGetWithHttpInfo**](ConvertApi.md#convertSyncGetWithHttpInfo) | **GET** /convert/sync |  |
| [**convertSyncPost**](ConvertApi.md#convertSyncPost) | **POST** /convert/sync |  |
| [**convertSyncPostWithHttpInfo**](ConvertApi.md#convertSyncPostWithHttpInfo) | **POST** /convert/sync |  |



## convertAsyncGet

> InfoResponse convertAsyncGet(url, targetFormat)



### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.ConvertApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        ConvertApi apiInstance = new ConvertApi(defaultClient);
        String url = "url_example"; // String | image url, supported formats jpeg,png,bmp,gif
        String targetFormat = "jpeg"; // String | 
        try {
            InfoResponse result = apiInstance.convertAsyncGet(url, targetFormat);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConvertApi#convertAsyncGet");
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
| **url** | **String**| image url, supported formats jpeg,png,bmp,gif | |
| **targetFormat** | **String**|  | [optional] [enum: jpeg, png, bmp, ico, gif] |

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

## convertAsyncGetWithHttpInfo

> ApiResponse<InfoResponse> convertAsyncGet convertAsyncGetWithHttpInfo(url, targetFormat)



### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.ApiResponse;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.ConvertApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        ConvertApi apiInstance = new ConvertApi(defaultClient);
        String url = "url_example"; // String | image url, supported formats jpeg,png,bmp,gif
        String targetFormat = "jpeg"; // String | 
        try {
            ApiResponse<InfoResponse> response = apiInstance.convertAsyncGetWithHttpInfo(url, targetFormat);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConvertApi#convertAsyncGet");
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
| **url** | **String**| image url, supported formats jpeg,png,bmp,gif | |
| **targetFormat** | **String**|  | [optional] [enum: jpeg, png, bmp, ico, gif] |

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


## convertAsyncPost

> InfoResponse convertAsyncPost(brightnessAsyncPostRequest, targetFormat)



### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.ConvertApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        ConvertApi apiInstance = new ConvertApi(defaultClient);
        BrightnessAsyncPostRequest brightnessAsyncPostRequest = new BrightnessAsyncPostRequest(); // BrightnessAsyncPostRequest | 
        String targetFormat = "jpeg"; // String | 
        try {
            InfoResponse result = apiInstance.convertAsyncPost(brightnessAsyncPostRequest, targetFormat);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConvertApi#convertAsyncPost");
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
| **brightnessAsyncPostRequest** | [**BrightnessAsyncPostRequest**](BrightnessAsyncPostRequest.md)|  | |
| **targetFormat** | **String**|  | [optional] [enum: jpeg, png, bmp, ico, gif] |

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

## convertAsyncPostWithHttpInfo

> ApiResponse<InfoResponse> convertAsyncPost convertAsyncPostWithHttpInfo(brightnessAsyncPostRequest, targetFormat)



### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.ApiResponse;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.ConvertApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        ConvertApi apiInstance = new ConvertApi(defaultClient);
        BrightnessAsyncPostRequest brightnessAsyncPostRequest = new BrightnessAsyncPostRequest(); // BrightnessAsyncPostRequest | 
        String targetFormat = "jpeg"; // String | 
        try {
            ApiResponse<InfoResponse> response = apiInstance.convertAsyncPostWithHttpInfo(brightnessAsyncPostRequest, targetFormat);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConvertApi#convertAsyncPost");
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
| **brightnessAsyncPostRequest** | [**BrightnessAsyncPostRequest**](BrightnessAsyncPostRequest.md)|  | |
| **targetFormat** | **String**|  | [optional] [enum: jpeg, png, bmp, ico, gif] |

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


## convertSyncGet

> File convertSyncGet(url, targetFormat)



### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.ConvertApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        ConvertApi apiInstance = new ConvertApi(defaultClient);
        String url = "url_example"; // String | image url, supported formats jpeg,png,bmp,gif
        String targetFormat = "jpeg"; // String | 
        try {
            File result = apiInstance.convertSyncGet(url, targetFormat);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConvertApi#convertSyncGet");
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
| **url** | **String**| image url, supported formats jpeg,png,bmp,gif | |
| **targetFormat** | **String**|  | [optional] [enum: jpeg, png, bmp, ico, gif] |

### Return type

[**File**](File.md)


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: image/bmp, image/gif, image/jpeg, image/png, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response contains the image file |  -  |
| **400** | Bad Request |  -  |

## convertSyncGetWithHttpInfo

> ApiResponse<File> convertSyncGet convertSyncGetWithHttpInfo(url, targetFormat)



### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.ApiResponse;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.ConvertApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        ConvertApi apiInstance = new ConvertApi(defaultClient);
        String url = "url_example"; // String | image url, supported formats jpeg,png,bmp,gif
        String targetFormat = "jpeg"; // String | 
        try {
            ApiResponse<File> response = apiInstance.convertSyncGetWithHttpInfo(url, targetFormat);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConvertApi#convertSyncGet");
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
| **url** | **String**| image url, supported formats jpeg,png,bmp,gif | |
| **targetFormat** | **String**|  | [optional] [enum: jpeg, png, bmp, ico, gif] |

### Return type

ApiResponse<[**File**](File.md)>


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: image/bmp, image/gif, image/jpeg, image/png, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response contains the image file |  -  |
| **400** | Bad Request |  -  |


## convertSyncPost

> File convertSyncPost(brightnessAsyncPostRequest, targetFormat)



### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.ConvertApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        ConvertApi apiInstance = new ConvertApi(defaultClient);
        BrightnessAsyncPostRequest brightnessAsyncPostRequest = new BrightnessAsyncPostRequest(); // BrightnessAsyncPostRequest | 
        String targetFormat = "jpeg"; // String | 
        try {
            File result = apiInstance.convertSyncPost(brightnessAsyncPostRequest, targetFormat);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConvertApi#convertSyncPost");
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
| **brightnessAsyncPostRequest** | [**BrightnessAsyncPostRequest**](BrightnessAsyncPostRequest.md)|  | |
| **targetFormat** | **String**|  | [optional] [enum: jpeg, png, bmp, ico, gif] |

### Return type

[**File**](File.md)


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/octet-stream
- **Accept**: image/bmp, image/gif, image/jpeg, image/png, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response contains the image file |  -  |
| **400** | Bad Request |  -  |

## convertSyncPostWithHttpInfo

> ApiResponse<File> convertSyncPost convertSyncPostWithHttpInfo(brightnessAsyncPostRequest, targetFormat)



### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.ApiResponse;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.ConvertApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        ConvertApi apiInstance = new ConvertApi(defaultClient);
        BrightnessAsyncPostRequest brightnessAsyncPostRequest = new BrightnessAsyncPostRequest(); // BrightnessAsyncPostRequest | 
        String targetFormat = "jpeg"; // String | 
        try {
            ApiResponse<File> response = apiInstance.convertSyncPostWithHttpInfo(brightnessAsyncPostRequest, targetFormat);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConvertApi#convertSyncPost");
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
| **brightnessAsyncPostRequest** | [**BrightnessAsyncPostRequest**](BrightnessAsyncPostRequest.md)|  | |
| **targetFormat** | **String**|  | [optional] [enum: jpeg, png, bmp, ico, gif] |

### Return type

ApiResponse<[**File**](File.md)>


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/octet-stream
- **Accept**: image/bmp, image/gif, image/jpeg, image/png, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response contains the image file |  -  |
| **400** | Bad Request |  -  |

