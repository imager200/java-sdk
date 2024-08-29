# ResizeApi

All URIs are relative to *https://api.imager200.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**resizeAsyncGet**](ResizeApi.md#resizeAsyncGet) | **GET** /resize |  |
| [**resizeAsyncGetWithHttpInfo**](ResizeApi.md#resizeAsyncGetWithHttpInfo) | **GET** /resize |  |
| [**resizeAsyncPost**](ResizeApi.md#resizeAsyncPost) | **POST** /resize |  |
| [**resizeAsyncPostWithHttpInfo**](ResizeApi.md#resizeAsyncPostWithHttpInfo) | **POST** /resize |  |
| [**resizeSyncGet**](ResizeApi.md#resizeSyncGet) | **GET** /resize/sync |  |
| [**resizeSyncGetWithHttpInfo**](ResizeApi.md#resizeSyncGetWithHttpInfo) | **GET** /resize/sync |  |
| [**resizeSyncPost**](ResizeApi.md#resizeSyncPost) | **POST** /resize/sync |  |
| [**resizeSyncPostWithHttpInfo**](ResizeApi.md#resizeSyncPostWithHttpInfo) | **POST** /resize/sync |  |



## resizeAsyncGet

> InfoResponse resizeAsyncGet(url, height, width, resamplingAlgorithm)



![resize](https://api-docs.imager200.io/images/examples/thumbs-up.png)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.ResizeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        ResizeApi apiInstance = new ResizeApi(defaultClient);
        String url = "url_example"; // String | image url, supported formats jpeg,png,bmp,gif
        Integer height = 56; // Integer | 
        Integer width = 56; // Integer | 
        String resamplingAlgorithm = "lanczos"; // String | It allows changing the resampling algorithm used when resizing (resampling) the image.
        try {
            InfoResponse result = apiInstance.resizeAsyncGet(url, height, width, resamplingAlgorithm);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ResizeApi#resizeAsyncGet");
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
| **height** | **Integer**|  | |
| **width** | **Integer**|  | |
| **resamplingAlgorithm** | **String**| It allows changing the resampling algorithm used when resizing (resampling) the image. | [optional] [default to lanczos] [enum: lanczos, linear, box, nearest_neighbor, catmull_rom] |

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

## resizeAsyncGetWithHttpInfo

> ApiResponse<InfoResponse> resizeAsyncGet resizeAsyncGetWithHttpInfo(url, height, width, resamplingAlgorithm)



![resize](https://api-docs.imager200.io/images/examples/thumbs-up.png)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.ApiResponse;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.ResizeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        ResizeApi apiInstance = new ResizeApi(defaultClient);
        String url = "url_example"; // String | image url, supported formats jpeg,png,bmp,gif
        Integer height = 56; // Integer | 
        Integer width = 56; // Integer | 
        String resamplingAlgorithm = "lanczos"; // String | It allows changing the resampling algorithm used when resizing (resampling) the image.
        try {
            ApiResponse<InfoResponse> response = apiInstance.resizeAsyncGetWithHttpInfo(url, height, width, resamplingAlgorithm);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ResizeApi#resizeAsyncGet");
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
| **height** | **Integer**|  | |
| **width** | **Integer**|  | |
| **resamplingAlgorithm** | **String**| It allows changing the resampling algorithm used when resizing (resampling) the image. | [optional] [default to lanczos] [enum: lanczos, linear, box, nearest_neighbor, catmull_rom] |

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


## resizeAsyncPost

> InfoResponse resizeAsyncPost(height, width, brightnessAsyncPostRequest, resamplingAlgorithm)



![resize](https://api-docs.imager200.io/images/examples/thumbs-up.png)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.ResizeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        ResizeApi apiInstance = new ResizeApi(defaultClient);
        Integer height = 56; // Integer | 
        Integer width = 56; // Integer | 
        BrightnessAsyncPostRequest brightnessAsyncPostRequest = new BrightnessAsyncPostRequest(); // BrightnessAsyncPostRequest | 
        String resamplingAlgorithm = "lanczos"; // String | It allows changing the resampling algorithm used when resizing (resampling) the image.
        try {
            InfoResponse result = apiInstance.resizeAsyncPost(height, width, brightnessAsyncPostRequest, resamplingAlgorithm);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ResizeApi#resizeAsyncPost");
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
| **height** | **Integer**|  | |
| **width** | **Integer**|  | |
| **brightnessAsyncPostRequest** | [**BrightnessAsyncPostRequest**](BrightnessAsyncPostRequest.md)|  | |
| **resamplingAlgorithm** | **String**| It allows changing the resampling algorithm used when resizing (resampling) the image. | [optional] [default to lanczos] [enum: lanczos, linear, box, nearest_neighbor, catmull_rom] |

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

## resizeAsyncPostWithHttpInfo

> ApiResponse<InfoResponse> resizeAsyncPost resizeAsyncPostWithHttpInfo(height, width, brightnessAsyncPostRequest, resamplingAlgorithm)



![resize](https://api-docs.imager200.io/images/examples/thumbs-up.png)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.ApiResponse;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.ResizeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        ResizeApi apiInstance = new ResizeApi(defaultClient);
        Integer height = 56; // Integer | 
        Integer width = 56; // Integer | 
        BrightnessAsyncPostRequest brightnessAsyncPostRequest = new BrightnessAsyncPostRequest(); // BrightnessAsyncPostRequest | 
        String resamplingAlgorithm = "lanczos"; // String | It allows changing the resampling algorithm used when resizing (resampling) the image.
        try {
            ApiResponse<InfoResponse> response = apiInstance.resizeAsyncPostWithHttpInfo(height, width, brightnessAsyncPostRequest, resamplingAlgorithm);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ResizeApi#resizeAsyncPost");
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
| **height** | **Integer**|  | |
| **width** | **Integer**|  | |
| **brightnessAsyncPostRequest** | [**BrightnessAsyncPostRequest**](BrightnessAsyncPostRequest.md)|  | |
| **resamplingAlgorithm** | **String**| It allows changing the resampling algorithm used when resizing (resampling) the image. | [optional] [default to lanczos] [enum: lanczos, linear, box, nearest_neighbor, catmull_rom] |

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


## resizeSyncGet

> File resizeSyncGet(url, height, width, resamplingAlgorithm)



![resize](https://api-docs.imager200.io/images/examples/thumbs-up.png)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.ResizeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        ResizeApi apiInstance = new ResizeApi(defaultClient);
        String url = "url_example"; // String | image url, supported formats jpeg,png,bmp,gif
        Integer height = 56; // Integer | 
        Integer width = 56; // Integer | 
        String resamplingAlgorithm = "lanczos"; // String | It allows changing the resampling algorithm used when resizing (resampling) the image.
        try {
            File result = apiInstance.resizeSyncGet(url, height, width, resamplingAlgorithm);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ResizeApi#resizeSyncGet");
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
| **height** | **Integer**|  | |
| **width** | **Integer**|  | |
| **resamplingAlgorithm** | **String**| It allows changing the resampling algorithm used when resizing (resampling) the image. | [optional] [default to lanczos] [enum: lanczos, linear, box, nearest_neighbor, catmull_rom] |

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

## resizeSyncGetWithHttpInfo

> ApiResponse<File> resizeSyncGet resizeSyncGetWithHttpInfo(url, height, width, resamplingAlgorithm)



![resize](https://api-docs.imager200.io/images/examples/thumbs-up.png)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.ApiResponse;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.ResizeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        ResizeApi apiInstance = new ResizeApi(defaultClient);
        String url = "url_example"; // String | image url, supported formats jpeg,png,bmp,gif
        Integer height = 56; // Integer | 
        Integer width = 56; // Integer | 
        String resamplingAlgorithm = "lanczos"; // String | It allows changing the resampling algorithm used when resizing (resampling) the image.
        try {
            ApiResponse<File> response = apiInstance.resizeSyncGetWithHttpInfo(url, height, width, resamplingAlgorithm);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ResizeApi#resizeSyncGet");
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
| **height** | **Integer**|  | |
| **width** | **Integer**|  | |
| **resamplingAlgorithm** | **String**| It allows changing the resampling algorithm used when resizing (resampling) the image. | [optional] [default to lanczos] [enum: lanczos, linear, box, nearest_neighbor, catmull_rom] |

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


## resizeSyncPost

> File resizeSyncPost(height, width, brightnessAsyncPostRequest, resamplingAlgorithm)



![resize](https://api-docs.imager200.io/images/examples/thumbs-up.png)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.ResizeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        ResizeApi apiInstance = new ResizeApi(defaultClient);
        Integer height = 56; // Integer | 
        Integer width = 56; // Integer | 
        BrightnessAsyncPostRequest brightnessAsyncPostRequest = new BrightnessAsyncPostRequest(); // BrightnessAsyncPostRequest | 
        String resamplingAlgorithm = "lanczos"; // String | It allows changing the resampling algorithm used when resizing (resampling) the image.
        try {
            File result = apiInstance.resizeSyncPost(height, width, brightnessAsyncPostRequest, resamplingAlgorithm);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ResizeApi#resizeSyncPost");
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
| **height** | **Integer**|  | |
| **width** | **Integer**|  | |
| **brightnessAsyncPostRequest** | [**BrightnessAsyncPostRequest**](BrightnessAsyncPostRequest.md)|  | |
| **resamplingAlgorithm** | **String**| It allows changing the resampling algorithm used when resizing (resampling) the image. | [optional] [default to lanczos] [enum: lanczos, linear, box, nearest_neighbor, catmull_rom] |

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

## resizeSyncPostWithHttpInfo

> ApiResponse<File> resizeSyncPost resizeSyncPostWithHttpInfo(height, width, brightnessAsyncPostRequest, resamplingAlgorithm)



![resize](https://api-docs.imager200.io/images/examples/thumbs-up.png)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.ApiResponse;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.ResizeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        ResizeApi apiInstance = new ResizeApi(defaultClient);
        Integer height = 56; // Integer | 
        Integer width = 56; // Integer | 
        BrightnessAsyncPostRequest brightnessAsyncPostRequest = new BrightnessAsyncPostRequest(); // BrightnessAsyncPostRequest | 
        String resamplingAlgorithm = "lanczos"; // String | It allows changing the resampling algorithm used when resizing (resampling) the image.
        try {
            ApiResponse<File> response = apiInstance.resizeSyncPostWithHttpInfo(height, width, brightnessAsyncPostRequest, resamplingAlgorithm);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ResizeApi#resizeSyncPost");
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
| **height** | **Integer**|  | |
| **width** | **Integer**|  | |
| **brightnessAsyncPostRequest** | [**BrightnessAsyncPostRequest**](BrightnessAsyncPostRequest.md)|  | |
| **resamplingAlgorithm** | **String**| It allows changing the resampling algorithm used when resizing (resampling) the image. | [optional] [default to lanczos] [enum: lanczos, linear, box, nearest_neighbor, catmull_rom] |

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

