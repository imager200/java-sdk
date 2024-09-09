# PipelineApi

All URIs are relative to *https://api.imager200.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**pipelineGet**](PipelineApi.md#pipelineGet) | **GET** /pipeline/{name} |  |
| [**pipelineGetWithHttpInfo**](PipelineApi.md#pipelineGetWithHttpInfo) | **GET** /pipeline/{name} |  |
| [**pipelineGetStatus**](PipelineApi.md#pipelineGetStatus) | **GET** /pipeline/{execution_id}/status |  |
| [**pipelineGetStatusWithHttpInfo**](PipelineApi.md#pipelineGetStatusWithHttpInfo) | **GET** /pipeline/{execution_id}/status |  |
| [**pipelinePost**](PipelineApi.md#pipelinePost) | **POST** /pipeline/{name} |  |
| [**pipelinePostWithHttpInfo**](PipelineApi.md#pipelinePostWithHttpInfo) | **POST** /pipeline/{name} |  |



## pipelineGet

> SuccessResponse pipelineGet(url, name)



### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.PipelineApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        PipelineApi apiInstance = new PipelineApi(defaultClient);
        String url = "url_example"; // String | image url, supported formats jpeg,png,bmp
        String name = "name_example"; // String | the name of the pipeline
        try {
            SuccessResponse result = apiInstance.pipelineGet(url, name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PipelineApi#pipelineGet");
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
| **name** | **String**| the name of the pipeline | |

### Return type

[**SuccessResponse**](SuccessResponse.md)


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The pipeline will be applied to the image based on the stored configuration. The result will be stored according to the post operation configured in the pipeline |  -  |
| **400** | invalid pipeline definition (pipeline is new and not yet configured) |  -  |
| **404** | pipeline does not exist |  -  |

## pipelineGetWithHttpInfo

> ApiResponse<SuccessResponse> pipelineGet pipelineGetWithHttpInfo(url, name)



### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.ApiResponse;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.PipelineApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        PipelineApi apiInstance = new PipelineApi(defaultClient);
        String url = "url_example"; // String | image url, supported formats jpeg,png,bmp
        String name = "name_example"; // String | the name of the pipeline
        try {
            ApiResponse<SuccessResponse> response = apiInstance.pipelineGetWithHttpInfo(url, name);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PipelineApi#pipelineGet");
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
| **name** | **String**| the name of the pipeline | |

### Return type

ApiResponse<[**SuccessResponse**](SuccessResponse.md)>


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The pipeline will be applied to the image based on the stored configuration. The result will be stored according to the post operation configured in the pipeline |  -  |
| **400** | invalid pipeline definition (pipeline is new and not yet configured) |  -  |
| **404** | pipeline does not exist |  -  |


## pipelineGetStatus

> PipelineExecutionResult pipelineGetStatus(executionId)



returns the current status of a pipeline

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.PipelineApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        PipelineApi apiInstance = new PipelineApi(defaultClient);
        String executionId = "executionId_example"; // String | the execution id obtained from the pipeline creation response
        try {
            PipelineExecutionResult result = apiInstance.pipelineGetStatus(executionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PipelineApi#pipelineGetStatus");
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
| **executionId** | **String**| the execution id obtained from the pipeline creation response | |

### Return type

[**PipelineExecutionResult**](PipelineExecutionResult.md)


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## pipelineGetStatusWithHttpInfo

> ApiResponse<PipelineExecutionResult> pipelineGetStatus pipelineGetStatusWithHttpInfo(executionId)



returns the current status of a pipeline

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.ApiResponse;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.PipelineApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        PipelineApi apiInstance = new PipelineApi(defaultClient);
        String executionId = "executionId_example"; // String | the execution id obtained from the pipeline creation response
        try {
            ApiResponse<PipelineExecutionResult> response = apiInstance.pipelineGetStatusWithHttpInfo(executionId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PipelineApi#pipelineGetStatus");
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
| **executionId** | **String**| the execution id obtained from the pipeline creation response | |

### Return type

ApiResponse<[**PipelineExecutionResult**](PipelineExecutionResult.md)>


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## pipelinePost

> SuccessResponse pipelinePost(name, body)



### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.PipelineApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        PipelineApi apiInstance = new PipelineApi(defaultClient);
        String name = "name_example"; // String | the name of the pipeline
        File body = new File("/path/to/file"); // File | image binary data, acceptable formats: jpeg,png,bmp,gif (depending on operations)
        try {
            SuccessResponse result = apiInstance.pipelinePost(name, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PipelineApi#pipelinePost");
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
| **name** | **String**| the name of the pipeline | |
| **body** | **File**| image binary data, acceptable formats: jpeg,png,bmp,gif (depending on operations) | |

### Return type

[**SuccessResponse**](SuccessResponse.md)


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/octet-stream
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The pipeline will be applied to the image based on the stored configuration. The result will be stored according to the post operation configured in the pipeline |  -  |
| **400** | invalid pipeline definition (pipeline is new and not yet configured) |  -  |
| **404** | pipeline does not exist |  -  |

## pipelinePostWithHttpInfo

> ApiResponse<SuccessResponse> pipelinePost pipelinePostWithHttpInfo(name, body)



### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.ApiResponse;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.PipelineApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        PipelineApi apiInstance = new PipelineApi(defaultClient);
        String name = "name_example"; // String | the name of the pipeline
        File body = new File("/path/to/file"); // File | image binary data, acceptable formats: jpeg,png,bmp,gif (depending on operations)
        try {
            ApiResponse<SuccessResponse> response = apiInstance.pipelinePostWithHttpInfo(name, body);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PipelineApi#pipelinePost");
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
| **name** | **String**| the name of the pipeline | |
| **body** | **File**| image binary data, acceptable formats: jpeg,png,bmp,gif (depending on operations) | |

### Return type

ApiResponse<[**SuccessResponse**](SuccessResponse.md)>


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/octet-stream
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The pipeline will be applied to the image based on the stored configuration. The result will be stored according to the post operation configured in the pipeline |  -  |
| **400** | invalid pipeline definition (pipeline is new and not yet configured) |  -  |
| **404** | pipeline does not exist |  -  |

