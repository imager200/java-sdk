# ConcatApi

All URIs are relative to *https://api.imager200.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**concatAsyncPost**](ConcatApi.md#concatAsyncPost) | **POST** /concat |  |
| [**concatAsyncPostWithHttpInfo**](ConcatApi.md#concatAsyncPostWithHttpInfo) | **POST** /concat |  |
| [**concatSyncPost**](ConcatApi.md#concatSyncPost) | **POST** /concat/sync |  |
| [**concatSyncPostWithHttpInfo**](ConcatApi.md#concatSyncPostWithHttpInfo) | **POST** /concat/sync |  |



## concatAsyncPost

> InfoResponse concatAsyncPost(payload)



__image 2__:   ![concat](https://api-docs.imager200.io/images/examples/concat_candidate.png)  __result__:  ![concat_result](https://api-docs.imager200.io/images/examples/concat_example.jpeg)  

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.ConcatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        ConcatApi apiInstance = new ConcatApi(defaultClient);
        ConcatRequest payload = new ConcatRequest(); // ConcatRequest | request
        try {
            InfoResponse result = apiInstance.concatAsyncPost(payload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConcatApi#concatAsyncPost");
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
| **payload** | [**ConcatRequest**](ConcatRequest.md)| request | |

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

## concatAsyncPostWithHttpInfo

> ApiResponse<InfoResponse> concatAsyncPost concatAsyncPostWithHttpInfo(payload)



__image 2__:   ![concat](https://api-docs.imager200.io/images/examples/concat_candidate.png)  __result__:  ![concat_result](https://api-docs.imager200.io/images/examples/concat_example.jpeg)  

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.ApiResponse;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.ConcatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        ConcatApi apiInstance = new ConcatApi(defaultClient);
        ConcatRequest payload = new ConcatRequest(); // ConcatRequest | request
        try {
            ApiResponse<InfoResponse> response = apiInstance.concatAsyncPostWithHttpInfo(payload);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConcatApi#concatAsyncPost");
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
| **payload** | [**ConcatRequest**](ConcatRequest.md)| request | |

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


## concatSyncPost

> File concatSyncPost(payload)



__image 2__:   ![concat](https://api-docs.imager200.io/images/examples/concat_candidate.png)  __result__:  ![concat_result](https://api-docs.imager200.io/images/examples/concat_example.jpeg)  

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.ConcatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        ConcatApi apiInstance = new ConcatApi(defaultClient);
        ConcatRequest payload = new ConcatRequest(); // ConcatRequest | request
        try {
            File result = apiInstance.concatSyncPost(payload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConcatApi#concatSyncPost");
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
| **payload** | [**ConcatRequest**](ConcatRequest.md)| request | |

### Return type

[**File**](File.md)


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: image/bmp, image/gif, image/jpeg, image/png, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response contains the image file |  -  |
| **400** | Bad Request |  -  |

## concatSyncPostWithHttpInfo

> ApiResponse<File> concatSyncPost concatSyncPostWithHttpInfo(payload)



__image 2__:   ![concat](https://api-docs.imager200.io/images/examples/concat_candidate.png)  __result__:  ![concat_result](https://api-docs.imager200.io/images/examples/concat_example.jpeg)  

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.ApiResponse;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.ConcatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        ConcatApi apiInstance = new ConcatApi(defaultClient);
        ConcatRequest payload = new ConcatRequest(); // ConcatRequest | request
        try {
            ApiResponse<File> response = apiInstance.concatSyncPostWithHttpInfo(payload);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConcatApi#concatSyncPost");
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
| **payload** | [**ConcatRequest**](ConcatRequest.md)| request | |

### Return type

ApiResponse<[**File**](File.md)>


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: image/bmp, image/gif, image/jpeg, image/png, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response contains the image file |  -  |
| **400** | Bad Request |  -  |

