# BlurApi

All URIs are relative to *https://api.imager200.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**blurAsyncGet**](BlurApi.md#blurAsyncGet) | **GET** /blur |  |
| [**blurAsyncGetWithHttpInfo**](BlurApi.md#blurAsyncGetWithHttpInfo) | **GET** /blur |  |
| [**blurAsyncPost**](BlurApi.md#blurAsyncPost) | **POST** /blur |  |
| [**blurAsyncPostWithHttpInfo**](BlurApi.md#blurAsyncPostWithHttpInfo) | **POST** /blur |  |
| [**blurSyncGet**](BlurApi.md#blurSyncGet) | **GET** /blur/sync |  |
| [**blurSyncGetWithHttpInfo**](BlurApi.md#blurSyncGetWithHttpInfo) | **GET** /blur/sync |  |
| [**blurSyncPost**](BlurApi.md#blurSyncPost) | **POST** /blur/sync |  |
| [**blurSyncPostWithHttpInfo**](BlurApi.md#blurSyncPostWithHttpInfo) | **POST** /blur/sync |  |



## blurAsyncGet

> InfoResponse blurAsyncGet(url, sigma)



   ![blur](https://api-docs.imager200.io/images/examples/blur_example.jpeg)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.BlurApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        BlurApi apiInstance = new BlurApi(defaultClient);
        String url = "url_example"; // String | image url, supported formats jpeg,png,bmp
        BigDecimal sigma = new BigDecimal("10"); // BigDecimal | controls the strength of the blur
        try {
            InfoResponse result = apiInstance.blurAsyncGet(url, sigma);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BlurApi#blurAsyncGet");
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
| **url** | **String**| image url, supported formats jpeg,png,bmp | |
| **sigma** | **BigDecimal**| controls the strength of the blur | [optional] [default to 10] |

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

## blurAsyncGetWithHttpInfo

> ApiResponse<InfoResponse> blurAsyncGet blurAsyncGetWithHttpInfo(url, sigma)



   ![blur](https://api-docs.imager200.io/images/examples/blur_example.jpeg)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.ApiResponse;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.BlurApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        BlurApi apiInstance = new BlurApi(defaultClient);
        String url = "url_example"; // String | image url, supported formats jpeg,png,bmp
        BigDecimal sigma = new BigDecimal("10"); // BigDecimal | controls the strength of the blur
        try {
            ApiResponse<InfoResponse> response = apiInstance.blurAsyncGetWithHttpInfo(url, sigma);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling BlurApi#blurAsyncGet");
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
| **url** | **String**| image url, supported formats jpeg,png,bmp | |
| **sigma** | **BigDecimal**| controls the strength of the blur | [optional] [default to 10] |

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


## blurAsyncPost

> InfoResponse blurAsyncPost(body, sigma)



   ![blur](https://api-docs.imager200.io/images/examples/blur_example.jpeg)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.BlurApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        BlurApi apiInstance = new BlurApi(defaultClient);
        File body = new File("/path/to/file"); // File | image binary data, acceptable formats: jpeg,png,bmp
        BigDecimal sigma = new BigDecimal("10"); // BigDecimal | controls the strength of the blur
        try {
            InfoResponse result = apiInstance.blurAsyncPost(body, sigma);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BlurApi#blurAsyncPost");
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
| **body** | **File**| image binary data, acceptable formats: jpeg,png,bmp | |
| **sigma** | **BigDecimal**| controls the strength of the blur | [optional] [default to 10] |

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

## blurAsyncPostWithHttpInfo

> ApiResponse<InfoResponse> blurAsyncPost blurAsyncPostWithHttpInfo(body, sigma)



   ![blur](https://api-docs.imager200.io/images/examples/blur_example.jpeg)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.ApiResponse;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.BlurApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        BlurApi apiInstance = new BlurApi(defaultClient);
        File body = new File("/path/to/file"); // File | image binary data, acceptable formats: jpeg,png,bmp
        BigDecimal sigma = new BigDecimal("10"); // BigDecimal | controls the strength of the blur
        try {
            ApiResponse<InfoResponse> response = apiInstance.blurAsyncPostWithHttpInfo(body, sigma);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling BlurApi#blurAsyncPost");
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
| **body** | **File**| image binary data, acceptable formats: jpeg,png,bmp | |
| **sigma** | **BigDecimal**| controls the strength of the blur | [optional] [default to 10] |

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


## blurSyncGet

> File blurSyncGet(url, sigma)



   ![blur](https://api-docs.imager200.io/images/examples/blur_example.jpeg)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.BlurApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        BlurApi apiInstance = new BlurApi(defaultClient);
        String url = "url_example"; // String | image url, supported formats jpeg,png,bmp
        BigDecimal sigma = new BigDecimal("10"); // BigDecimal | controls the strength of the blur
        try {
            File result = apiInstance.blurSyncGet(url, sigma);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BlurApi#blurSyncGet");
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
| **url** | **String**| image url, supported formats jpeg,png,bmp | |
| **sigma** | **BigDecimal**| controls the strength of the blur | [optional] [default to 10] |

### Return type

[**File**](File.md)


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: image/bmp, image/jpeg, image/png, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response contains the image file |  -  |
| **400** | Bad Request |  -  |

## blurSyncGetWithHttpInfo

> ApiResponse<File> blurSyncGet blurSyncGetWithHttpInfo(url, sigma)



   ![blur](https://api-docs.imager200.io/images/examples/blur_example.jpeg)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.ApiResponse;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.BlurApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        BlurApi apiInstance = new BlurApi(defaultClient);
        String url = "url_example"; // String | image url, supported formats jpeg,png,bmp
        BigDecimal sigma = new BigDecimal("10"); // BigDecimal | controls the strength of the blur
        try {
            ApiResponse<File> response = apiInstance.blurSyncGetWithHttpInfo(url, sigma);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling BlurApi#blurSyncGet");
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
| **url** | **String**| image url, supported formats jpeg,png,bmp | |
| **sigma** | **BigDecimal**| controls the strength of the blur | [optional] [default to 10] |

### Return type

ApiResponse<[**File**](File.md)>


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: image/bmp, image/jpeg, image/png, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response contains the image file |  -  |
| **400** | Bad Request |  -  |


## blurSyncPost

> File blurSyncPost(body, sigma)



   ![blur](https://api-docs.imager200.io/images/examples/blur_example.jpeg)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.BlurApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        BlurApi apiInstance = new BlurApi(defaultClient);
        File body = new File("/path/to/file"); // File | image binary data, acceptable formats: jpeg,png,bmp
        BigDecimal sigma = new BigDecimal("10"); // BigDecimal | controls the strength of the blur
        try {
            File result = apiInstance.blurSyncPost(body, sigma);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BlurApi#blurSyncPost");
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
| **body** | **File**| image binary data, acceptable formats: jpeg,png,bmp | |
| **sigma** | **BigDecimal**| controls the strength of the blur | [optional] [default to 10] |

### Return type

[**File**](File.md)


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/octet-stream
- **Accept**: image/bmp, image/jpeg, image/png, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response contains the image file |  -  |
| **400** | Bad Request |  -  |

## blurSyncPostWithHttpInfo

> ApiResponse<File> blurSyncPost blurSyncPostWithHttpInfo(body, sigma)



   ![blur](https://api-docs.imager200.io/images/examples/blur_example.jpeg)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.ApiResponse;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.BlurApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        BlurApi apiInstance = new BlurApi(defaultClient);
        File body = new File("/path/to/file"); // File | image binary data, acceptable formats: jpeg,png,bmp
        BigDecimal sigma = new BigDecimal("10"); // BigDecimal | controls the strength of the blur
        try {
            ApiResponse<File> response = apiInstance.blurSyncPostWithHttpInfo(body, sigma);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling BlurApi#blurSyncPost");
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
| **body** | **File**| image binary data, acceptable formats: jpeg,png,bmp | |
| **sigma** | **BigDecimal**| controls the strength of the blur | [optional] [default to 10] |

### Return type

ApiResponse<[**File**](File.md)>


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/octet-stream
- **Accept**: image/bmp, image/jpeg, image/png, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response contains the image file |  -  |
| **400** | Bad Request |  -  |

