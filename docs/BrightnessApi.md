# BrightnessApi

All URIs are relative to *https://api.imager200.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**brightnessAsyncGet**](BrightnessApi.md#brightnessAsyncGet) | **GET** /brightness |  |
| [**brightnessAsyncGetWithHttpInfo**](BrightnessApi.md#brightnessAsyncGetWithHttpInfo) | **GET** /brightness |  |
| [**brightnessAsyncPost**](BrightnessApi.md#brightnessAsyncPost) | **POST** /brightness |  |
| [**brightnessAsyncPostWithHttpInfo**](BrightnessApi.md#brightnessAsyncPostWithHttpInfo) | **POST** /brightness |  |
| [**brightnessSyncGet**](BrightnessApi.md#brightnessSyncGet) | **GET** /brightness/sync |  |
| [**brightnessSyncGetWithHttpInfo**](BrightnessApi.md#brightnessSyncGetWithHttpInfo) | **GET** /brightness/sync |  |
| [**brightnessSyncPost**](BrightnessApi.md#brightnessSyncPost) | **POST** /brightness/sync |  |
| [**brightnessSyncPostWithHttpInfo**](BrightnessApi.md#brightnessSyncPostWithHttpInfo) | **POST** /brightness/sync |  |



## brightnessAsyncGet

> InfoResponse brightnessAsyncGet(url, percentage)



![brightness](https://api-docs.imager200.io/images/examples/brightness_example.jpeg)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.BrightnessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        BrightnessApi apiInstance = new BrightnessApi(defaultClient);
        String url = "url_example"; // String | image url, supported formats jpeg,png,bmp,gif
        BigDecimal percentage = new BigDecimal("0"); // BigDecimal | controls the brightness level
        try {
            InfoResponse result = apiInstance.brightnessAsyncGet(url, percentage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BrightnessApi#brightnessAsyncGet");
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
| **percentage** | **BigDecimal**| controls the brightness level | [optional] [default to 0] |

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

## brightnessAsyncGetWithHttpInfo

> ApiResponse<InfoResponse> brightnessAsyncGet brightnessAsyncGetWithHttpInfo(url, percentage)



![brightness](https://api-docs.imager200.io/images/examples/brightness_example.jpeg)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.ApiResponse;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.BrightnessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        BrightnessApi apiInstance = new BrightnessApi(defaultClient);
        String url = "url_example"; // String | image url, supported formats jpeg,png,bmp,gif
        BigDecimal percentage = new BigDecimal("0"); // BigDecimal | controls the brightness level
        try {
            ApiResponse<InfoResponse> response = apiInstance.brightnessAsyncGetWithHttpInfo(url, percentage);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling BrightnessApi#brightnessAsyncGet");
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
| **percentage** | **BigDecimal**| controls the brightness level | [optional] [default to 0] |

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


## brightnessAsyncPost

> InfoResponse brightnessAsyncPost(brightnessAsyncPostRequest, percentage)



![brightness](https://api-docs.imager200.io/images/examples/brightness_example.jpeg)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.BrightnessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        BrightnessApi apiInstance = new BrightnessApi(defaultClient);
        BrightnessAsyncPostRequest brightnessAsyncPostRequest = new BrightnessAsyncPostRequest(); // BrightnessAsyncPostRequest | 
        BigDecimal percentage = new BigDecimal("0"); // BigDecimal | controls the brightness level
        try {
            InfoResponse result = apiInstance.brightnessAsyncPost(brightnessAsyncPostRequest, percentage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BrightnessApi#brightnessAsyncPost");
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
| **percentage** | **BigDecimal**| controls the brightness level | [optional] [default to 0] |

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

## brightnessAsyncPostWithHttpInfo

> ApiResponse<InfoResponse> brightnessAsyncPost brightnessAsyncPostWithHttpInfo(brightnessAsyncPostRequest, percentage)



![brightness](https://api-docs.imager200.io/images/examples/brightness_example.jpeg)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.ApiResponse;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.BrightnessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        BrightnessApi apiInstance = new BrightnessApi(defaultClient);
        BrightnessAsyncPostRequest brightnessAsyncPostRequest = new BrightnessAsyncPostRequest(); // BrightnessAsyncPostRequest | 
        BigDecimal percentage = new BigDecimal("0"); // BigDecimal | controls the brightness level
        try {
            ApiResponse<InfoResponse> response = apiInstance.brightnessAsyncPostWithHttpInfo(brightnessAsyncPostRequest, percentage);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling BrightnessApi#brightnessAsyncPost");
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
| **percentage** | **BigDecimal**| controls the brightness level | [optional] [default to 0] |

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


## brightnessSyncGet

> File brightnessSyncGet(url, percentage)



![brightness](https://api-docs.imager200.io/images/examples/brightness_example.jpeg)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.BrightnessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        BrightnessApi apiInstance = new BrightnessApi(defaultClient);
        String url = "url_example"; // String | image url, supported formats jpeg,png,bmp,gif
        BigDecimal percentage = new BigDecimal("0"); // BigDecimal | controls the brightness level
        try {
            File result = apiInstance.brightnessSyncGet(url, percentage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BrightnessApi#brightnessSyncGet");
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
| **percentage** | **BigDecimal**| controls the brightness level | [optional] [default to 0] |

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

## brightnessSyncGetWithHttpInfo

> ApiResponse<File> brightnessSyncGet brightnessSyncGetWithHttpInfo(url, percentage)



![brightness](https://api-docs.imager200.io/images/examples/brightness_example.jpeg)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.ApiResponse;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.BrightnessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        BrightnessApi apiInstance = new BrightnessApi(defaultClient);
        String url = "url_example"; // String | image url, supported formats jpeg,png,bmp,gif
        BigDecimal percentage = new BigDecimal("0"); // BigDecimal | controls the brightness level
        try {
            ApiResponse<File> response = apiInstance.brightnessSyncGetWithHttpInfo(url, percentage);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling BrightnessApi#brightnessSyncGet");
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
| **percentage** | **BigDecimal**| controls the brightness level | [optional] [default to 0] |

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


## brightnessSyncPost

> File brightnessSyncPost(brightnessAsyncPostRequest, percentage)



![brightness](https://api-docs.imager200.io/images/examples/brightness_example.jpeg)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.BrightnessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        BrightnessApi apiInstance = new BrightnessApi(defaultClient);
        BrightnessAsyncPostRequest brightnessAsyncPostRequest = new BrightnessAsyncPostRequest(); // BrightnessAsyncPostRequest | 
        BigDecimal percentage = new BigDecimal("0"); // BigDecimal | controls the brightness level
        try {
            File result = apiInstance.brightnessSyncPost(brightnessAsyncPostRequest, percentage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BrightnessApi#brightnessSyncPost");
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
| **percentage** | **BigDecimal**| controls the brightness level | [optional] [default to 0] |

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

## brightnessSyncPostWithHttpInfo

> ApiResponse<File> brightnessSyncPost brightnessSyncPostWithHttpInfo(brightnessAsyncPostRequest, percentage)



![brightness](https://api-docs.imager200.io/images/examples/brightness_example.jpeg)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.ApiResponse;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.BrightnessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        BrightnessApi apiInstance = new BrightnessApi(defaultClient);
        BrightnessAsyncPostRequest brightnessAsyncPostRequest = new BrightnessAsyncPostRequest(); // BrightnessAsyncPostRequest | 
        BigDecimal percentage = new BigDecimal("0"); // BigDecimal | controls the brightness level
        try {
            ApiResponse<File> response = apiInstance.brightnessSyncPostWithHttpInfo(brightnessAsyncPostRequest, percentage);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling BrightnessApi#brightnessSyncPost");
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
| **percentage** | **BigDecimal**| controls the brightness level | [optional] [default to 0] |

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

