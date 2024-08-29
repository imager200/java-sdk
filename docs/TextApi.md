# TextApi

All URIs are relative to *https://api.imager200.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**textAsyncGet**](TextApi.md#textAsyncGet) | **GET** /text |  |
| [**textAsyncGetWithHttpInfo**](TextApi.md#textAsyncGetWithHttpInfo) | **GET** /text |  |
| [**textAsyncPost**](TextApi.md#textAsyncPost) | **POST** /text |  |
| [**textAsyncPostWithHttpInfo**](TextApi.md#textAsyncPostWithHttpInfo) | **POST** /text |  |
| [**textSyncGet**](TextApi.md#textSyncGet) | **GET** /text/sync |  |
| [**textSyncGetWithHttpInfo**](TextApi.md#textSyncGetWithHttpInfo) | **GET** /text/sync |  |
| [**textSyncPost**](TextApi.md#textSyncPost) | **POST** /text/sync |  |
| [**textSyncPostWithHttpInfo**](TextApi.md#textSyncPostWithHttpInfo) | **POST** /text/sync |  |



## textAsyncGet

> InfoResponse textAsyncGet(url, text, color, font, size, x, y)



![text](https://api-docs.imager200.io/images/examples/text_example.jpeg)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.TextApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        TextApi apiInstance = new TextApi(defaultClient);
        String url = "url_example"; // String | image url, supported formats jpeg,png,bmp,gif
        String text = "text_example"; // String | the text to be added.
        String color = "white"; // String | defines the color of the text. Must be a valid color name (supported names are specified here  [https://www.w3schools.com/colors/colors_names.asp](https://www.w3schools.com/colors/colors_names.asp)) or hexadecimal code.
        String font = "calibri"; // String | defines the font type name. Possible values can be found [here](https://api-docs.imager200.io/fonts_example/). (More fonts can be added on request)
        BigDecimal size = new BigDecimal("12"); // BigDecimal | the text size in pixels.
        Integer x = 50; // Integer | the x coordinate in pixels of the point where the text will be added.
        Integer y = 50; // Integer | the y coordinate in pixels of the point where the text will be added.
        try {
            InfoResponse result = apiInstance.textAsyncGet(url, text, color, font, size, x, y);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TextApi#textAsyncGet");
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
| **text** | **String**| the text to be added. | |
| **color** | **String**| defines the color of the text. Must be a valid color name (supported names are specified here  [https://www.w3schools.com/colors/colors_names.asp](https://www.w3schools.com/colors/colors_names.asp)) or hexadecimal code. | [optional] [default to white] |
| **font** | **String**| defines the font type name. Possible values can be found [here](https://api-docs.imager200.io/fonts_example/). (More fonts can be added on request) | [optional] [default to calibri] |
| **size** | **BigDecimal**| the text size in pixels. | [optional] [default to 12] |
| **x** | **Integer**| the x coordinate in pixels of the point where the text will be added. | [optional] [default to 50] |
| **y** | **Integer**| the y coordinate in pixels of the point where the text will be added. | [optional] [default to 50] |

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

## textAsyncGetWithHttpInfo

> ApiResponse<InfoResponse> textAsyncGet textAsyncGetWithHttpInfo(url, text, color, font, size, x, y)



![text](https://api-docs.imager200.io/images/examples/text_example.jpeg)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.ApiResponse;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.TextApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        TextApi apiInstance = new TextApi(defaultClient);
        String url = "url_example"; // String | image url, supported formats jpeg,png,bmp,gif
        String text = "text_example"; // String | the text to be added.
        String color = "white"; // String | defines the color of the text. Must be a valid color name (supported names are specified here  [https://www.w3schools.com/colors/colors_names.asp](https://www.w3schools.com/colors/colors_names.asp)) or hexadecimal code.
        String font = "calibri"; // String | defines the font type name. Possible values can be found [here](https://api-docs.imager200.io/fonts_example/). (More fonts can be added on request)
        BigDecimal size = new BigDecimal("12"); // BigDecimal | the text size in pixels.
        Integer x = 50; // Integer | the x coordinate in pixels of the point where the text will be added.
        Integer y = 50; // Integer | the y coordinate in pixels of the point where the text will be added.
        try {
            ApiResponse<InfoResponse> response = apiInstance.textAsyncGetWithHttpInfo(url, text, color, font, size, x, y);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TextApi#textAsyncGet");
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
| **text** | **String**| the text to be added. | |
| **color** | **String**| defines the color of the text. Must be a valid color name (supported names are specified here  [https://www.w3schools.com/colors/colors_names.asp](https://www.w3schools.com/colors/colors_names.asp)) or hexadecimal code. | [optional] [default to white] |
| **font** | **String**| defines the font type name. Possible values can be found [here](https://api-docs.imager200.io/fonts_example/). (More fonts can be added on request) | [optional] [default to calibri] |
| **size** | **BigDecimal**| the text size in pixels. | [optional] [default to 12] |
| **x** | **Integer**| the x coordinate in pixels of the point where the text will be added. | [optional] [default to 50] |
| **y** | **Integer**| the y coordinate in pixels of the point where the text will be added. | [optional] [default to 50] |

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


## textAsyncPost

> InfoResponse textAsyncPost(text, brightnessAsyncPostRequest, color, font, size, x, y)



![text](https://api-docs.imager200.io/images/examples/text_example.jpeg)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.TextApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        TextApi apiInstance = new TextApi(defaultClient);
        String text = "text_example"; // String | the text to be added.
        BrightnessAsyncPostRequest brightnessAsyncPostRequest = new BrightnessAsyncPostRequest(); // BrightnessAsyncPostRequest | 
        String color = "white"; // String | defines the color of the text. Must be a valid color name (supported names are specified here  [https://www.w3schools.com/colors/colors_names.asp](https://www.w3schools.com/colors/colors_names.asp)) or hexadecimal code.
        String font = "calibri"; // String | defines the font type name. Possible values can be found [here](https://api-docs.imager200.io/fonts_example/). (More fonts can be added on request)
        BigDecimal size = new BigDecimal("12"); // BigDecimal | the text size in pixels.
        Integer x = 50; // Integer | the x coordinate in pixels of the point where the text will be added.
        Integer y = 50; // Integer | the y coordinate in pixels of the point where the text will be added.
        try {
            InfoResponse result = apiInstance.textAsyncPost(text, brightnessAsyncPostRequest, color, font, size, x, y);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TextApi#textAsyncPost");
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
| **text** | **String**| the text to be added. | |
| **brightnessAsyncPostRequest** | [**BrightnessAsyncPostRequest**](BrightnessAsyncPostRequest.md)|  | |
| **color** | **String**| defines the color of the text. Must be a valid color name (supported names are specified here  [https://www.w3schools.com/colors/colors_names.asp](https://www.w3schools.com/colors/colors_names.asp)) or hexadecimal code. | [optional] [default to white] |
| **font** | **String**| defines the font type name. Possible values can be found [here](https://api-docs.imager200.io/fonts_example/). (More fonts can be added on request) | [optional] [default to calibri] |
| **size** | **BigDecimal**| the text size in pixels. | [optional] [default to 12] |
| **x** | **Integer**| the x coordinate in pixels of the point where the text will be added. | [optional] [default to 50] |
| **y** | **Integer**| the y coordinate in pixels of the point where the text will be added. | [optional] [default to 50] |

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

## textAsyncPostWithHttpInfo

> ApiResponse<InfoResponse> textAsyncPost textAsyncPostWithHttpInfo(text, brightnessAsyncPostRequest, color, font, size, x, y)



![text](https://api-docs.imager200.io/images/examples/text_example.jpeg)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.ApiResponse;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.TextApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        TextApi apiInstance = new TextApi(defaultClient);
        String text = "text_example"; // String | the text to be added.
        BrightnessAsyncPostRequest brightnessAsyncPostRequest = new BrightnessAsyncPostRequest(); // BrightnessAsyncPostRequest | 
        String color = "white"; // String | defines the color of the text. Must be a valid color name (supported names are specified here  [https://www.w3schools.com/colors/colors_names.asp](https://www.w3schools.com/colors/colors_names.asp)) or hexadecimal code.
        String font = "calibri"; // String | defines the font type name. Possible values can be found [here](https://api-docs.imager200.io/fonts_example/). (More fonts can be added on request)
        BigDecimal size = new BigDecimal("12"); // BigDecimal | the text size in pixels.
        Integer x = 50; // Integer | the x coordinate in pixels of the point where the text will be added.
        Integer y = 50; // Integer | the y coordinate in pixels of the point where the text will be added.
        try {
            ApiResponse<InfoResponse> response = apiInstance.textAsyncPostWithHttpInfo(text, brightnessAsyncPostRequest, color, font, size, x, y);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TextApi#textAsyncPost");
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
| **text** | **String**| the text to be added. | |
| **brightnessAsyncPostRequest** | [**BrightnessAsyncPostRequest**](BrightnessAsyncPostRequest.md)|  | |
| **color** | **String**| defines the color of the text. Must be a valid color name (supported names are specified here  [https://www.w3schools.com/colors/colors_names.asp](https://www.w3schools.com/colors/colors_names.asp)) or hexadecimal code. | [optional] [default to white] |
| **font** | **String**| defines the font type name. Possible values can be found [here](https://api-docs.imager200.io/fonts_example/). (More fonts can be added on request) | [optional] [default to calibri] |
| **size** | **BigDecimal**| the text size in pixels. | [optional] [default to 12] |
| **x** | **Integer**| the x coordinate in pixels of the point where the text will be added. | [optional] [default to 50] |
| **y** | **Integer**| the y coordinate in pixels of the point where the text will be added. | [optional] [default to 50] |

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


## textSyncGet

> File textSyncGet(url, text, color, font, size, x, y)



![text](https://api-docs.imager200.io/images/examples/text_example.jpeg)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.TextApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        TextApi apiInstance = new TextApi(defaultClient);
        String url = "url_example"; // String | image url, supported formats jpeg,png,bmp,gif
        String text = "text_example"; // String | the text to be added.
        String color = "white"; // String | defines the color of the text. Must be a valid color name (supported names are specified here  [https://www.w3schools.com/colors/colors_names.asp](https://www.w3schools.com/colors/colors_names.asp)) or hexadecimal code.
        String font = "calibri"; // String | defines the font type name. Possible values can be found [here](https://api-docs.imager200.io/fonts_example/). (More fonts can be added on request)
        BigDecimal size = new BigDecimal("12"); // BigDecimal | the text size in pixels.
        Integer x = 50; // Integer | the x coordinate in pixels of the point where the text will be added.
        Integer y = 50; // Integer | the y coordinate in pixels of the point where the text will be added.
        try {
            File result = apiInstance.textSyncGet(url, text, color, font, size, x, y);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TextApi#textSyncGet");
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
| **text** | **String**| the text to be added. | |
| **color** | **String**| defines the color of the text. Must be a valid color name (supported names are specified here  [https://www.w3schools.com/colors/colors_names.asp](https://www.w3schools.com/colors/colors_names.asp)) or hexadecimal code. | [optional] [default to white] |
| **font** | **String**| defines the font type name. Possible values can be found [here](https://api-docs.imager200.io/fonts_example/). (More fonts can be added on request) | [optional] [default to calibri] |
| **size** | **BigDecimal**| the text size in pixels. | [optional] [default to 12] |
| **x** | **Integer**| the x coordinate in pixels of the point where the text will be added. | [optional] [default to 50] |
| **y** | **Integer**| the y coordinate in pixels of the point where the text will be added. | [optional] [default to 50] |

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

## textSyncGetWithHttpInfo

> ApiResponse<File> textSyncGet textSyncGetWithHttpInfo(url, text, color, font, size, x, y)



![text](https://api-docs.imager200.io/images/examples/text_example.jpeg)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.ApiResponse;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.TextApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        TextApi apiInstance = new TextApi(defaultClient);
        String url = "url_example"; // String | image url, supported formats jpeg,png,bmp,gif
        String text = "text_example"; // String | the text to be added.
        String color = "white"; // String | defines the color of the text. Must be a valid color name (supported names are specified here  [https://www.w3schools.com/colors/colors_names.asp](https://www.w3schools.com/colors/colors_names.asp)) or hexadecimal code.
        String font = "calibri"; // String | defines the font type name. Possible values can be found [here](https://api-docs.imager200.io/fonts_example/). (More fonts can be added on request)
        BigDecimal size = new BigDecimal("12"); // BigDecimal | the text size in pixels.
        Integer x = 50; // Integer | the x coordinate in pixels of the point where the text will be added.
        Integer y = 50; // Integer | the y coordinate in pixels of the point where the text will be added.
        try {
            ApiResponse<File> response = apiInstance.textSyncGetWithHttpInfo(url, text, color, font, size, x, y);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TextApi#textSyncGet");
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
| **text** | **String**| the text to be added. | |
| **color** | **String**| defines the color of the text. Must be a valid color name (supported names are specified here  [https://www.w3schools.com/colors/colors_names.asp](https://www.w3schools.com/colors/colors_names.asp)) or hexadecimal code. | [optional] [default to white] |
| **font** | **String**| defines the font type name. Possible values can be found [here](https://api-docs.imager200.io/fonts_example/). (More fonts can be added on request) | [optional] [default to calibri] |
| **size** | **BigDecimal**| the text size in pixels. | [optional] [default to 12] |
| **x** | **Integer**| the x coordinate in pixels of the point where the text will be added. | [optional] [default to 50] |
| **y** | **Integer**| the y coordinate in pixels of the point where the text will be added. | [optional] [default to 50] |

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


## textSyncPost

> File textSyncPost(text, brightnessAsyncPostRequest, color, font, size, x, y)



![text](https://api-docs.imager200.io/images/examples/text_example.jpeg)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.TextApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        TextApi apiInstance = new TextApi(defaultClient);
        String text = "text_example"; // String | the text to be added.
        BrightnessAsyncPostRequest brightnessAsyncPostRequest = new BrightnessAsyncPostRequest(); // BrightnessAsyncPostRequest | 
        String color = "white"; // String | defines the color of the text. Must be a valid color name (supported names are specified here  [https://www.w3schools.com/colors/colors_names.asp](https://www.w3schools.com/colors/colors_names.asp)) or hexadecimal code.
        String font = "calibri"; // String | defines the font type name. Possible values can be found [here](https://api-docs.imager200.io/fonts_example/). (More fonts can be added on request)
        BigDecimal size = new BigDecimal("12"); // BigDecimal | the text size in pixels.
        Integer x = 50; // Integer | the x coordinate in pixels of the point where the text will be added.
        Integer y = 50; // Integer | the y coordinate in pixels of the point where the text will be added.
        try {
            File result = apiInstance.textSyncPost(text, brightnessAsyncPostRequest, color, font, size, x, y);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TextApi#textSyncPost");
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
| **text** | **String**| the text to be added. | |
| **brightnessAsyncPostRequest** | [**BrightnessAsyncPostRequest**](BrightnessAsyncPostRequest.md)|  | |
| **color** | **String**| defines the color of the text. Must be a valid color name (supported names are specified here  [https://www.w3schools.com/colors/colors_names.asp](https://www.w3schools.com/colors/colors_names.asp)) or hexadecimal code. | [optional] [default to white] |
| **font** | **String**| defines the font type name. Possible values can be found [here](https://api-docs.imager200.io/fonts_example/). (More fonts can be added on request) | [optional] [default to calibri] |
| **size** | **BigDecimal**| the text size in pixels. | [optional] [default to 12] |
| **x** | **Integer**| the x coordinate in pixels of the point where the text will be added. | [optional] [default to 50] |
| **y** | **Integer**| the y coordinate in pixels of the point where the text will be added. | [optional] [default to 50] |

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

## textSyncPostWithHttpInfo

> ApiResponse<File> textSyncPost textSyncPostWithHttpInfo(text, brightnessAsyncPostRequest, color, font, size, x, y)



![text](https://api-docs.imager200.io/images/examples/text_example.jpeg)

### Example

```java
// Import classes:
import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.ApiResponse;
import io.imager200.Configuration;
import io.imager200.auth.*;
import io.imager200.models.*;
import io.imager200.client.TextApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.imager200.io");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        TextApi apiInstance = new TextApi(defaultClient);
        String text = "text_example"; // String | the text to be added.
        BrightnessAsyncPostRequest brightnessAsyncPostRequest = new BrightnessAsyncPostRequest(); // BrightnessAsyncPostRequest | 
        String color = "white"; // String | defines the color of the text. Must be a valid color name (supported names are specified here  [https://www.w3schools.com/colors/colors_names.asp](https://www.w3schools.com/colors/colors_names.asp)) or hexadecimal code.
        String font = "calibri"; // String | defines the font type name. Possible values can be found [here](https://api-docs.imager200.io/fonts_example/). (More fonts can be added on request)
        BigDecimal size = new BigDecimal("12"); // BigDecimal | the text size in pixels.
        Integer x = 50; // Integer | the x coordinate in pixels of the point where the text will be added.
        Integer y = 50; // Integer | the y coordinate in pixels of the point where the text will be added.
        try {
            ApiResponse<File> response = apiInstance.textSyncPostWithHttpInfo(text, brightnessAsyncPostRequest, color, font, size, x, y);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TextApi#textSyncPost");
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
| **text** | **String**| the text to be added. | |
| **brightnessAsyncPostRequest** | [**BrightnessAsyncPostRequest**](BrightnessAsyncPostRequest.md)|  | |
| **color** | **String**| defines the color of the text. Must be a valid color name (supported names are specified here  [https://www.w3schools.com/colors/colors_names.asp](https://www.w3schools.com/colors/colors_names.asp)) or hexadecimal code. | [optional] [default to white] |
| **font** | **String**| defines the font type name. Possible values can be found [here](https://api-docs.imager200.io/fonts_example/). (More fonts can be added on request) | [optional] [default to calibri] |
| **size** | **BigDecimal**| the text size in pixels. | [optional] [default to 12] |
| **x** | **Integer**| the x coordinate in pixels of the point where the text will be added. | [optional] [default to 50] |
| **y** | **Integer**| the y coordinate in pixels of the point where the text will be added. | [optional] [default to 50] |

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

