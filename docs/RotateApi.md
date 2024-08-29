# RotateApi

All URIs are relative to *https://api.imager200.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**rotateAsyncGet**](RotateApi.md#rotateAsyncGet) | **GET** /rotate |  |
| [**rotateAsyncGetWithHttpInfo**](RotateApi.md#rotateAsyncGetWithHttpInfo) | **GET** /rotate |  |
| [**rotateAsyncPost**](RotateApi.md#rotateAsyncPost) | **POST** /rotate |  |
| [**rotateAsyncPostWithHttpInfo**](RotateApi.md#rotateAsyncPostWithHttpInfo) | **POST** /rotate |  |
| [**rotateSyncGet**](RotateApi.md#rotateSyncGet) | **GET** /rotate/sync |  |
| [**rotateSyncGetWithHttpInfo**](RotateApi.md#rotateSyncGetWithHttpInfo) | **GET** /rotate/sync |  |
| [**rotateSyncPost**](RotateApi.md#rotateSyncPost) | **POST** /rotate/sync |  |
| [**rotateSyncPostWithHttpInfo**](RotateApi.md#rotateSyncPostWithHttpInfo) | **POST** /rotate/sync |  |



## rotateAsyncGet

> InfoResponse rotateAsyncGet(url, angle, backgroundColor)



![rotate](https://api-docs.imager200.io/images/examples/rotate_example.jpeg)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.RotateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        RotateApi apiInstance = new RotateApi(defaultClient);
        String url = "url_example"; // String | image url, supported formats jpeg,png,bmp,gif
        BigDecimal angle = new BigDecimal("90"); // BigDecimal | rotation angle in degrees
        String backgroundColor = "white"; // String | the color that should be used to fill the empty surfaces after rotating the image. Must be a valid color name (supported names are specified [here](https://www.w3schools.com/colors/colors_names.asp)) or hexadecimal code.
        try {
            InfoResponse result = apiInstance.rotateAsyncGet(url, angle, backgroundColor);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RotateApi#rotateAsyncGet");
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
| **angle** | **BigDecimal**| rotation angle in degrees | [optional] [default to 90] |
| **backgroundColor** | **String**| the color that should be used to fill the empty surfaces after rotating the image. Must be a valid color name (supported names are specified [here](https://www.w3schools.com/colors/colors_names.asp)) or hexadecimal code. | [optional] [default to white] |

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

## rotateAsyncGetWithHttpInfo

> ApiResponse<InfoResponse> rotateAsyncGet rotateAsyncGetWithHttpInfo(url, angle, backgroundColor)



![rotate](https://api-docs.imager200.io/images/examples/rotate_example.jpeg)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.ApiResponse;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.RotateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        RotateApi apiInstance = new RotateApi(defaultClient);
        String url = "url_example"; // String | image url, supported formats jpeg,png,bmp,gif
        BigDecimal angle = new BigDecimal("90"); // BigDecimal | rotation angle in degrees
        String backgroundColor = "white"; // String | the color that should be used to fill the empty surfaces after rotating the image. Must be a valid color name (supported names are specified [here](https://www.w3schools.com/colors/colors_names.asp)) or hexadecimal code.
        try {
            ApiResponse<InfoResponse> response = apiInstance.rotateAsyncGetWithHttpInfo(url, angle, backgroundColor);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RotateApi#rotateAsyncGet");
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
| **angle** | **BigDecimal**| rotation angle in degrees | [optional] [default to 90] |
| **backgroundColor** | **String**| the color that should be used to fill the empty surfaces after rotating the image. Must be a valid color name (supported names are specified [here](https://www.w3schools.com/colors/colors_names.asp)) or hexadecimal code. | [optional] [default to white] |

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


## rotateAsyncPost

> InfoResponse rotateAsyncPost(brightnessAsyncPostRequest, angle, backgroundColor)



![rotate](https://api-docs.imager200.io/images/examples/rotate_example.jpeg)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.RotateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        RotateApi apiInstance = new RotateApi(defaultClient);
        BrightnessAsyncPostRequest brightnessAsyncPostRequest = new BrightnessAsyncPostRequest(); // BrightnessAsyncPostRequest | 
        BigDecimal angle = new BigDecimal("90"); // BigDecimal | rotation angle in degrees
        String backgroundColor = "white"; // String | the color that should be used to fill the empty surfaces after rotating the image. Must be a valid color name (supported names are specified [here](https://www.w3schools.com/colors/colors_names.asp)) or hexadecimal code.
        try {
            InfoResponse result = apiInstance.rotateAsyncPost(brightnessAsyncPostRequest, angle, backgroundColor);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RotateApi#rotateAsyncPost");
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
| **angle** | **BigDecimal**| rotation angle in degrees | [optional] [default to 90] |
| **backgroundColor** | **String**| the color that should be used to fill the empty surfaces after rotating the image. Must be a valid color name (supported names are specified [here](https://www.w3schools.com/colors/colors_names.asp)) or hexadecimal code. | [optional] [default to white] |

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

## rotateAsyncPostWithHttpInfo

> ApiResponse<InfoResponse> rotateAsyncPost rotateAsyncPostWithHttpInfo(brightnessAsyncPostRequest, angle, backgroundColor)



![rotate](https://api-docs.imager200.io/images/examples/rotate_example.jpeg)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.ApiResponse;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.RotateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        RotateApi apiInstance = new RotateApi(defaultClient);
        BrightnessAsyncPostRequest brightnessAsyncPostRequest = new BrightnessAsyncPostRequest(); // BrightnessAsyncPostRequest | 
        BigDecimal angle = new BigDecimal("90"); // BigDecimal | rotation angle in degrees
        String backgroundColor = "white"; // String | the color that should be used to fill the empty surfaces after rotating the image. Must be a valid color name (supported names are specified [here](https://www.w3schools.com/colors/colors_names.asp)) or hexadecimal code.
        try {
            ApiResponse<InfoResponse> response = apiInstance.rotateAsyncPostWithHttpInfo(brightnessAsyncPostRequest, angle, backgroundColor);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RotateApi#rotateAsyncPost");
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
| **angle** | **BigDecimal**| rotation angle in degrees | [optional] [default to 90] |
| **backgroundColor** | **String**| the color that should be used to fill the empty surfaces after rotating the image. Must be a valid color name (supported names are specified [here](https://www.w3schools.com/colors/colors_names.asp)) or hexadecimal code. | [optional] [default to white] |

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


## rotateSyncGet

> File rotateSyncGet(url, angle, backgroundColor)



![rotate](https://api-docs.imager200.io/images/examples/rotate_example.jpeg)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.RotateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        RotateApi apiInstance = new RotateApi(defaultClient);
        String url = "url_example"; // String | image url, supported formats jpeg,png,bmp,gif
        BigDecimal angle = new BigDecimal("90"); // BigDecimal | rotation angle in degrees
        String backgroundColor = "white"; // String | the color that should be used to fill the empty surfaces after rotating the image. Must be a valid color name (supported names are specified [here](https://www.w3schools.com/colors/colors_names.asp)) or hexadecimal code.
        try {
            File result = apiInstance.rotateSyncGet(url, angle, backgroundColor);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RotateApi#rotateSyncGet");
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
| **angle** | **BigDecimal**| rotation angle in degrees | [optional] [default to 90] |
| **backgroundColor** | **String**| the color that should be used to fill the empty surfaces after rotating the image. Must be a valid color name (supported names are specified [here](https://www.w3schools.com/colors/colors_names.asp)) or hexadecimal code. | [optional] [default to white] |

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

## rotateSyncGetWithHttpInfo

> ApiResponse<File> rotateSyncGet rotateSyncGetWithHttpInfo(url, angle, backgroundColor)



![rotate](https://api-docs.imager200.io/images/examples/rotate_example.jpeg)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.ApiResponse;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.RotateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        RotateApi apiInstance = new RotateApi(defaultClient);
        String url = "url_example"; // String | image url, supported formats jpeg,png,bmp,gif
        BigDecimal angle = new BigDecimal("90"); // BigDecimal | rotation angle in degrees
        String backgroundColor = "white"; // String | the color that should be used to fill the empty surfaces after rotating the image. Must be a valid color name (supported names are specified [here](https://www.w3schools.com/colors/colors_names.asp)) or hexadecimal code.
        try {
            ApiResponse<File> response = apiInstance.rotateSyncGetWithHttpInfo(url, angle, backgroundColor);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RotateApi#rotateSyncGet");
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
| **angle** | **BigDecimal**| rotation angle in degrees | [optional] [default to 90] |
| **backgroundColor** | **String**| the color that should be used to fill the empty surfaces after rotating the image. Must be a valid color name (supported names are specified [here](https://www.w3schools.com/colors/colors_names.asp)) or hexadecimal code. | [optional] [default to white] |

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


## rotateSyncPost

> File rotateSyncPost(brightnessAsyncPostRequest, angle, backgroundColor)



![rotate](https://api-docs.imager200.io/images/examples/rotate_example.jpeg)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.RotateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        RotateApi apiInstance = new RotateApi(defaultClient);
        BrightnessAsyncPostRequest brightnessAsyncPostRequest = new BrightnessAsyncPostRequest(); // BrightnessAsyncPostRequest | 
        BigDecimal angle = new BigDecimal("90"); // BigDecimal | rotation angle in degrees
        String backgroundColor = "white"; // String | the color that should be used to fill the empty surfaces after rotating the image. Must be a valid color name (supported names are specified [here](https://www.w3schools.com/colors/colors_names.asp)) or hexadecimal code.
        try {
            File result = apiInstance.rotateSyncPost(brightnessAsyncPostRequest, angle, backgroundColor);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RotateApi#rotateSyncPost");
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
| **angle** | **BigDecimal**| rotation angle in degrees | [optional] [default to 90] |
| **backgroundColor** | **String**| the color that should be used to fill the empty surfaces after rotating the image. Must be a valid color name (supported names are specified [here](https://www.w3schools.com/colors/colors_names.asp)) or hexadecimal code. | [optional] [default to white] |

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

## rotateSyncPostWithHttpInfo

> ApiResponse<File> rotateSyncPost rotateSyncPostWithHttpInfo(brightnessAsyncPostRequest, angle, backgroundColor)



![rotate](https://api-docs.imager200.io/images/examples/rotate_example.jpeg)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.ApiResponse;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.RotateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        RotateApi apiInstance = new RotateApi(defaultClient);
        BrightnessAsyncPostRequest brightnessAsyncPostRequest = new BrightnessAsyncPostRequest(); // BrightnessAsyncPostRequest | 
        BigDecimal angle = new BigDecimal("90"); // BigDecimal | rotation angle in degrees
        String backgroundColor = "white"; // String | the color that should be used to fill the empty surfaces after rotating the image. Must be a valid color name (supported names are specified [here](https://www.w3schools.com/colors/colors_names.asp)) or hexadecimal code.
        try {
            ApiResponse<File> response = apiInstance.rotateSyncPostWithHttpInfo(brightnessAsyncPostRequest, angle, backgroundColor);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RotateApi#rotateSyncPost");
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
| **angle** | **BigDecimal**| rotation angle in degrees | [optional] [default to 90] |
| **backgroundColor** | **String**| the color that should be used to fill the empty surfaces after rotating the image. Must be a valid color name (supported names are specified [here](https://www.w3schools.com/colors/colors_names.asp)) or hexadecimal code. | [optional] [default to white] |

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

