# CropApi

All URIs are relative to *https://api.imager200.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cropAsyncGet**](CropApi.md#cropAsyncGet) | **GET** /crop |  |
| [**cropAsyncGetWithHttpInfo**](CropApi.md#cropAsyncGetWithHttpInfo) | **GET** /crop |  |
| [**cropAsyncPost**](CropApi.md#cropAsyncPost) | **POST** /crop |  |
| [**cropAsyncPostWithHttpInfo**](CropApi.md#cropAsyncPostWithHttpInfo) | **POST** /crop |  |
| [**cropSyncGet**](CropApi.md#cropSyncGet) | **GET** /crop/sync |  |
| [**cropSyncGetWithHttpInfo**](CropApi.md#cropSyncGetWithHttpInfo) | **GET** /crop/sync |  |
| [**cropSyncPost**](CropApi.md#cropSyncPost) | **POST** /crop/sync |  |
| [**cropSyncPostWithHttpInfo**](CropApi.md#cropSyncPostWithHttpInfo) | **POST** /crop/sync |  |



## cropAsyncGet

> InfoResponse cropAsyncGet(url, x0, x1, y0, y1)



  ![crop](https://api-docs.imager200.io/images/examples/crop_example.jpeg)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.CropApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        CropApi apiInstance = new CropApi(defaultClient);
        String url = "url_example"; // String | image url, supported formats jpeg,png,bmp,gif
        Integer x0 = 56; // Integer | the x coordinate of the first point of the rectangle to crop.
        Integer x1 = 56; // Integer | the x coordinate of the second point of the rectangle to crop.
        Integer y0 = 56; // Integer | the y coordinate of the first point of the rectangle to crop.
        Integer y1 = 56; // Integer | the y coordinate of the second point of the rectangle to crop.
        try {
            InfoResponse result = apiInstance.cropAsyncGet(url, x0, x1, y0, y1);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CropApi#cropAsyncGet");
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
| **x0** | **Integer**| the x coordinate of the first point of the rectangle to crop. | |
| **x1** | **Integer**| the x coordinate of the second point of the rectangle to crop. | |
| **y0** | **Integer**| the y coordinate of the first point of the rectangle to crop. | |
| **y1** | **Integer**| the y coordinate of the second point of the rectangle to crop. | |

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

## cropAsyncGetWithHttpInfo

> ApiResponse<InfoResponse> cropAsyncGet cropAsyncGetWithHttpInfo(url, x0, x1, y0, y1)



  ![crop](https://api-docs.imager200.io/images/examples/crop_example.jpeg)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.ApiResponse;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.CropApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        CropApi apiInstance = new CropApi(defaultClient);
        String url = "url_example"; // String | image url, supported formats jpeg,png,bmp,gif
        Integer x0 = 56; // Integer | the x coordinate of the first point of the rectangle to crop.
        Integer x1 = 56; // Integer | the x coordinate of the second point of the rectangle to crop.
        Integer y0 = 56; // Integer | the y coordinate of the first point of the rectangle to crop.
        Integer y1 = 56; // Integer | the y coordinate of the second point of the rectangle to crop.
        try {
            ApiResponse<InfoResponse> response = apiInstance.cropAsyncGetWithHttpInfo(url, x0, x1, y0, y1);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CropApi#cropAsyncGet");
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
| **x0** | **Integer**| the x coordinate of the first point of the rectangle to crop. | |
| **x1** | **Integer**| the x coordinate of the second point of the rectangle to crop. | |
| **y0** | **Integer**| the y coordinate of the first point of the rectangle to crop. | |
| **y1** | **Integer**| the y coordinate of the second point of the rectangle to crop. | |

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


## cropAsyncPost

> InfoResponse cropAsyncPost(x0, x1, y0, y1, brightnessAsyncPostRequest)



  ![crop](https://api-docs.imager200.io/images/examples/crop_example.jpeg)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.CropApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        CropApi apiInstance = new CropApi(defaultClient);
        Integer x0 = 56; // Integer | the x coordinate of the first point of the rectangle to crop.
        Integer x1 = 56; // Integer | the x coordinate of the second point of the rectangle to crop.
        Integer y0 = 56; // Integer | the y coordinate of the first point of the rectangle to crop.
        Integer y1 = 56; // Integer | the y coordinate of the second point of the rectangle to crop.
        BrightnessAsyncPostRequest brightnessAsyncPostRequest = new BrightnessAsyncPostRequest(); // BrightnessAsyncPostRequest | 
        try {
            InfoResponse result = apiInstance.cropAsyncPost(x0, x1, y0, y1, brightnessAsyncPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CropApi#cropAsyncPost");
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
| **x0** | **Integer**| the x coordinate of the first point of the rectangle to crop. | |
| **x1** | **Integer**| the x coordinate of the second point of the rectangle to crop. | |
| **y0** | **Integer**| the y coordinate of the first point of the rectangle to crop. | |
| **y1** | **Integer**| the y coordinate of the second point of the rectangle to crop. | |
| **brightnessAsyncPostRequest** | [**BrightnessAsyncPostRequest**](BrightnessAsyncPostRequest.md)|  | |

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

## cropAsyncPostWithHttpInfo

> ApiResponse<InfoResponse> cropAsyncPost cropAsyncPostWithHttpInfo(x0, x1, y0, y1, brightnessAsyncPostRequest)



  ![crop](https://api-docs.imager200.io/images/examples/crop_example.jpeg)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.ApiResponse;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.CropApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        CropApi apiInstance = new CropApi(defaultClient);
        Integer x0 = 56; // Integer | the x coordinate of the first point of the rectangle to crop.
        Integer x1 = 56; // Integer | the x coordinate of the second point of the rectangle to crop.
        Integer y0 = 56; // Integer | the y coordinate of the first point of the rectangle to crop.
        Integer y1 = 56; // Integer | the y coordinate of the second point of the rectangle to crop.
        BrightnessAsyncPostRequest brightnessAsyncPostRequest = new BrightnessAsyncPostRequest(); // BrightnessAsyncPostRequest | 
        try {
            ApiResponse<InfoResponse> response = apiInstance.cropAsyncPostWithHttpInfo(x0, x1, y0, y1, brightnessAsyncPostRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CropApi#cropAsyncPost");
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
| **x0** | **Integer**| the x coordinate of the first point of the rectangle to crop. | |
| **x1** | **Integer**| the x coordinate of the second point of the rectangle to crop. | |
| **y0** | **Integer**| the y coordinate of the first point of the rectangle to crop. | |
| **y1** | **Integer**| the y coordinate of the second point of the rectangle to crop. | |
| **brightnessAsyncPostRequest** | [**BrightnessAsyncPostRequest**](BrightnessAsyncPostRequest.md)|  | |

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


## cropSyncGet

> File cropSyncGet(url, x0, x1, y0, y1)



  ![crop](https://api-docs.imager200.io/images/examples/crop_example.jpeg)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.CropApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        CropApi apiInstance = new CropApi(defaultClient);
        String url = "url_example"; // String | image url, supported formats jpeg,png,bmp,gif
        Integer x0 = 56; // Integer | the x coordinate of the first point of the rectangle to crop.
        Integer x1 = 56; // Integer | the x coordinate of the second point of the rectangle to crop.
        Integer y0 = 56; // Integer | the y coordinate of the first point of the rectangle to crop.
        Integer y1 = 56; // Integer | the y coordinate of the second point of the rectangle to crop.
        try {
            File result = apiInstance.cropSyncGet(url, x0, x1, y0, y1);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CropApi#cropSyncGet");
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
| **x0** | **Integer**| the x coordinate of the first point of the rectangle to crop. | |
| **x1** | **Integer**| the x coordinate of the second point of the rectangle to crop. | |
| **y0** | **Integer**| the y coordinate of the first point of the rectangle to crop. | |
| **y1** | **Integer**| the y coordinate of the second point of the rectangle to crop. | |

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

## cropSyncGetWithHttpInfo

> ApiResponse<File> cropSyncGet cropSyncGetWithHttpInfo(url, x0, x1, y0, y1)



  ![crop](https://api-docs.imager200.io/images/examples/crop_example.jpeg)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.ApiResponse;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.CropApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        CropApi apiInstance = new CropApi(defaultClient);
        String url = "url_example"; // String | image url, supported formats jpeg,png,bmp,gif
        Integer x0 = 56; // Integer | the x coordinate of the first point of the rectangle to crop.
        Integer x1 = 56; // Integer | the x coordinate of the second point of the rectangle to crop.
        Integer y0 = 56; // Integer | the y coordinate of the first point of the rectangle to crop.
        Integer y1 = 56; // Integer | the y coordinate of the second point of the rectangle to crop.
        try {
            ApiResponse<File> response = apiInstance.cropSyncGetWithHttpInfo(url, x0, x1, y0, y1);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CropApi#cropSyncGet");
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
| **x0** | **Integer**| the x coordinate of the first point of the rectangle to crop. | |
| **x1** | **Integer**| the x coordinate of the second point of the rectangle to crop. | |
| **y0** | **Integer**| the y coordinate of the first point of the rectangle to crop. | |
| **y1** | **Integer**| the y coordinate of the second point of the rectangle to crop. | |

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


## cropSyncPost

> File cropSyncPost(x0, x1, y0, y1, brightnessAsyncPostRequest)



  ![crop](https://api-docs.imager200.io/images/examples/crop_example.jpeg)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.CropApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        CropApi apiInstance = new CropApi(defaultClient);
        Integer x0 = 56; // Integer | the x coordinate of the first point of the rectangle to crop.
        Integer x1 = 56; // Integer | the x coordinate of the second point of the rectangle to crop.
        Integer y0 = 56; // Integer | the y coordinate of the first point of the rectangle to crop.
        Integer y1 = 56; // Integer | the y coordinate of the second point of the rectangle to crop.
        BrightnessAsyncPostRequest brightnessAsyncPostRequest = new BrightnessAsyncPostRequest(); // BrightnessAsyncPostRequest | 
        try {
            File result = apiInstance.cropSyncPost(x0, x1, y0, y1, brightnessAsyncPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CropApi#cropSyncPost");
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
| **x0** | **Integer**| the x coordinate of the first point of the rectangle to crop. | |
| **x1** | **Integer**| the x coordinate of the second point of the rectangle to crop. | |
| **y0** | **Integer**| the y coordinate of the first point of the rectangle to crop. | |
| **y1** | **Integer**| the y coordinate of the second point of the rectangle to crop. | |
| **brightnessAsyncPostRequest** | [**BrightnessAsyncPostRequest**](BrightnessAsyncPostRequest.md)|  | |

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

## cropSyncPostWithHttpInfo

> ApiResponse<File> cropSyncPost cropSyncPostWithHttpInfo(x0, x1, y0, y1, brightnessAsyncPostRequest)



  ![crop](https://api-docs.imager200.io/images/examples/crop_example.jpeg)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.ApiResponse;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.CropApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        CropApi apiInstance = new CropApi(defaultClient);
        Integer x0 = 56; // Integer | the x coordinate of the first point of the rectangle to crop.
        Integer x1 = 56; // Integer | the x coordinate of the second point of the rectangle to crop.
        Integer y0 = 56; // Integer | the y coordinate of the first point of the rectangle to crop.
        Integer y1 = 56; // Integer | the y coordinate of the second point of the rectangle to crop.
        BrightnessAsyncPostRequest brightnessAsyncPostRequest = new BrightnessAsyncPostRequest(); // BrightnessAsyncPostRequest | 
        try {
            ApiResponse<File> response = apiInstance.cropSyncPostWithHttpInfo(x0, x1, y0, y1, brightnessAsyncPostRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CropApi#cropSyncPost");
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
| **x0** | **Integer**| the x coordinate of the first point of the rectangle to crop. | |
| **x1** | **Integer**| the x coordinate of the second point of the rectangle to crop. | |
| **y0** | **Integer**| the y coordinate of the first point of the rectangle to crop. | |
| **y1** | **Integer**| the y coordinate of the second point of the rectangle to crop. | |
| **brightnessAsyncPostRequest** | [**BrightnessAsyncPostRequest**](BrightnessAsyncPostRequest.md)|  | |

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

