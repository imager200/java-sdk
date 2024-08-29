# BlendApi

All URIs are relative to *https://api.imager200.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**blendAsyncPost**](BlendApi.md#blendAsyncPost) | **POST** /blend |  |
| [**blendAsyncPostWithHttpInfo**](BlendApi.md#blendAsyncPostWithHttpInfo) | **POST** /blend |  |
| [**blendSyncPost**](BlendApi.md#blendSyncPost) | **POST** /blend/sync |  |
| [**blendSyncPostWithHttpInfo**](BlendApi.md#blendSyncPostWithHttpInfo) | **POST** /blend/sync |  |



## blendAsyncPost

> InfoResponse blendAsyncPost(payload)



This endpoint blends two images.   __second_image__:   ![image2](https://api-docs.imager200.io/images/examples/thumbs-up.png)  __result__:  ![blend_result](https://api-docs.imager200.io/images/examples/blend_example.png)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.BlendApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        BlendApi apiInstance = new BlendApi(defaultClient);
        BlendRequest payload = new BlendRequest(); // BlendRequest | request
        try {
            InfoResponse result = apiInstance.blendAsyncPost(payload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BlendApi#blendAsyncPost");
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
| **payload** | [**BlendRequest**](BlendRequest.md)| request | |

### Return type

[**InfoResponse**](InfoResponse.md)


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  * Location - the temporary url of an image in case a post operation id is not provided <br>  |
| **400** | Bad Request |  -  |

## blendAsyncPostWithHttpInfo

> ApiResponse<InfoResponse> blendAsyncPost blendAsyncPostWithHttpInfo(payload)



This endpoint blends two images.   __second_image__:   ![image2](https://api-docs.imager200.io/images/examples/thumbs-up.png)  __result__:  ![blend_result](https://api-docs.imager200.io/images/examples/blend_example.png)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.ApiResponse;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.BlendApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        BlendApi apiInstance = new BlendApi(defaultClient);
        BlendRequest payload = new BlendRequest(); // BlendRequest | request
        try {
            ApiResponse<InfoResponse> response = apiInstance.blendAsyncPostWithHttpInfo(payload);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling BlendApi#blendAsyncPost");
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
| **payload** | [**BlendRequest**](BlendRequest.md)| request | |

### Return type

ApiResponse<[**InfoResponse**](InfoResponse.md)>


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  * Location - the temporary url of an image in case a post operation id is not provided <br>  |
| **400** | Bad Request |  -  |


## blendSyncPost

> File blendSyncPost(payload)



This endpoint blends two images.   __second_image__:   ![image2](https://api-docs.imager200.io/images/examples/thumbs-up.png)  __result__:  ![blend_result](https://api-docs.imager200.io/images/examples/blend_example.png)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.BlendApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        BlendApi apiInstance = new BlendApi(defaultClient);
        BlendRequest payload = new BlendRequest(); // BlendRequest | request
        try {
            File result = apiInstance.blendSyncPost(payload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BlendApi#blendSyncPost");
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
| **payload** | [**BlendRequest**](BlendRequest.md)| request | |

### Return type

[**File**](File.md)


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: image/bmp, image/jpeg, image/png, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response contains the image file |  -  |
| **400** | Bad Request |  -  |

## blendSyncPostWithHttpInfo

> ApiResponse<File> blendSyncPost blendSyncPostWithHttpInfo(payload)



This endpoint blends two images.   __second_image__:   ![image2](https://api-docs.imager200.io/images/examples/thumbs-up.png)  __result__:  ![blend_result](https://api-docs.imager200.io/images/examples/blend_example.png)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.ApiResponse;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.BlendApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        BlendApi apiInstance = new BlendApi(defaultClient);
        BlendRequest payload = new BlendRequest(); // BlendRequest | request
        try {
            ApiResponse<File> response = apiInstance.blendSyncPostWithHttpInfo(payload);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling BlendApi#blendSyncPost");
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
| **payload** | [**BlendRequest**](BlendRequest.md)| request | |

### Return type

ApiResponse<[**File**](File.md)>


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: image/bmp, image/jpeg, image/png, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response contains the image file |  -  |
| **400** | Bad Request |  -  |

