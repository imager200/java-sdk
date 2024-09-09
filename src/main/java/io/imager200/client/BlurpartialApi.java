/*
 * imager200 API
 *   Welcome to imager200! the API for image processing and image workflow automation.        You can find detailed specification of each endpoint and usage examples.      All endpoints  have synchronous (`/{endpoint}/sync`) and asynchronous (`/{endpoint}`) versions. Synchronous endpoints returns the result image in the body of the response (and thus the response is suspended until the processing is finished). The asynchronous endpoint returns immediately and processes the image asap. The image is stored according to the provided `post operation` configuration or stored in our temporary storage where the `Location` header specifies the exact location. More details on post operations can be found on the getting started [guides](/getting-started)    Most endpoints (except `/blend`, `/concat`) allow to send the image either in the body of the request (POST endpoints) or send only the url of the image (GET endpoints) to be downloaded and processed by the API.     Therefore there are 4 possibilities for most endpoints `GET /{endpoint}?url={imageUrl}`, `GET /{endpoint}/sync?url={imageUrl}`, `POST /{endpoint}/sync`, `POST /{endpoint}`    If you find some outdated or inacurate information. Please let us know anytime at [contact@imager200.io](mailto:contact@imager200.io)  ## Authentication:  All API requests need to have an `X-Imager-Key` header with your provided API key as a value otherwise 401 will be returned.   Your API key can be obtained from the [control panel](https://panel.imager200.io) once you sign up. More details can be found on the getting started [guides](/getting-started).  It's possible to test the API without registration using the guest API key, which can be found above the Authorize section below. Note that the guest API key expires every 10 mins and is only used for testing purposes. For a permanent API key, a sign up is needed.    ## Common headers:  | Name | Description | | ---- | ----------- | | X-Imager-Key | Contains the API key. should be part of every request  | | X-PostOp-Id | Optional. Only used in async endpoints. It contains the post operation id that should be applied after processing the image | | X-Upload-File-Name  | Optional. Can be used to give the stored image a name instead of a random / the configured one. The value in this header takes precedence over the file naming convention configured in the post operation. **The value should contain the file name only without extension.**  | | X-Imgur-Title  | **Available in case an imgur post operation is used.** Optional header to set the image title in imgur. The value in the header takes precedence over the stored configuration. | | X-Imgur-Description  | **Available in case an imgur post operation is used.** Optional header to set the image description in imgur. The value in the header takes precedence over the stored configuration. | | X-GPhoto-Description  | **Available in case a google photo post operation is used.** Optional header to set the image description in google photo. |  ## Common Responses:  | Status | Description | | ------ | ----------- | | 402 | indicates that something is wrong with your subscription: either your subscription payment is past due or you have exceeded the maximum allowed requests by your plan.  | | 503 | error that indicates an unreachable service (usually the authentication server) | | 401 | indicates that your API key is wrong or missing | | 400 | validation error specific to the endpoint parameters. Can also indicate that the `X-PostOp-Id` value is not found or the image format is not valid or unsupported | | 201 | returned by async endpoints to indicate that requests has been received and being processed. It does not necessarily mean the success of the operation.  | | 200 | returned by sync endpoints. Means that the request has succeeded and the result is in the response body. |  ## Mime types:  When submitting an image to an endpoint, the content type can be of type `application/octet-stream` or `image/_*`.  ## Post Operations:  Because many post operations require the OAuth flow for obtaining the access token to the storage provider API, the creation of post operations can only be done manually through the [control panel](https://panel.imager200.io).  The current integrations are available:  * Dropbox  * Google Drive  * Google Photos  * Google Cloud storage (suspended temporarily because of Google verification)  * AWS S3  * SCP (secure copy)  * Microsoft OneDrive  * Microsoft Azure Storage  * imgur  * http (send the image to a defined http address)  The getting started [guides](/getting-started) contains detailed usage examples and video demos for each post operation.   ## Pipelines:  pipelines can be invoked throught the API, but can only be created through the [control panel](https://panel.imager200.io). The getting started [guides](/getting-started) describes the pipelines inner workings in details.   ## Limits  For security measures and for avoiding server overload, endpoints have the following limits:  - Max image width: 4096 pixels - Max image height: 4096 pixels - Max image size: 20MB - Requests per second: 15 - Max connections from one host: 10  If you need an increase in the limits, please let us know by creating a ticket from the control panel.  ## Reference image:  This image will be used in all the examples for the endpoints below.   ![reference_image](https://api-docs.imager200.io/images/examples/jpeg_image.jpg)  
 *
 * The version of the OpenAPI document: 1.0
 * Contact: contact@imager200.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.imager200.client;

import io.imager200.ApiClient;
import io.imager200.ApiException;
import io.imager200.ApiResponse;
import io.imager200.Pair;

import java.math.BigDecimal;
import io.imager200.model.ErrorResponse;
import java.io.File;
import io.imager200.model.InfoResponse;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.http.HttpRequest;
import java.nio.channels.Channels;
import java.nio.channels.Pipe;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-09T18:04:56.023056641+02:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class BlurpartialApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public BlurpartialApi() {
    this(new ApiClient());
  }

  public BlurpartialApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
    memberVarAsyncResponseInterceptor = apiClient.getAsyncResponseInterceptor();
  }

  protected ApiException getApiException(String operationId, HttpResponse<InputStream> response) throws IOException {
    String body = response.body() == null ? null : new String(response.body().readAllBytes());
    String message = formatExceptionMessage(operationId, response.statusCode(), body);
    return new ApiException(response.statusCode(), message, response.headers(), body);
  }

  private String formatExceptionMessage(String operationId, int statusCode, String body) {
    if (body == null || body.isEmpty()) {
      body = "[no body]";
    }
    return operationId + " call failed with: " + statusCode + " - " + body;
  }

  /**
   * 
   *  Blurs a fraction of the image defined by the rectangle (x0, y0, x1, y1)  ![blur_partial](https://api-docs.imager200.io/images/examples/blur_partial_example.jpeg)
   * @param url image url, supported formats jpeg,png,bmp (required)
   * @param x0 defines the x coordinate of the first point of the rectangle to blur (required)
   * @param x1 defines the x coordinate of the second point of the rectangle to blur (required)
   * @param y0 defines the y coordinate of the first point of the rectangle to blur (required)
   * @param y1 defines the y coordinate of the second point of the rectangle to blur. (required)
   * @param sigma controls the strength of the blur (optional, default to 10)
   * @return InfoResponse
   * @throws ApiException if fails to make API call
   */
  public InfoResponse blurpartialAsyncGet(String url, Integer x0, Integer x1, Integer y0, Integer y1, BigDecimal sigma) throws ApiException {
    ApiResponse<InfoResponse> localVarResponse = blurpartialAsyncGetWithHttpInfo(url, x0, x1, y0, y1, sigma);
    return localVarResponse.getData();
  }

  /**
   * 
   *  Blurs a fraction of the image defined by the rectangle (x0, y0, x1, y1)  ![blur_partial](https://api-docs.imager200.io/images/examples/blur_partial_example.jpeg)
   * @param url image url, supported formats jpeg,png,bmp (required)
   * @param x0 defines the x coordinate of the first point of the rectangle to blur (required)
   * @param x1 defines the x coordinate of the second point of the rectangle to blur (required)
   * @param y0 defines the y coordinate of the first point of the rectangle to blur (required)
   * @param y1 defines the y coordinate of the second point of the rectangle to blur. (required)
   * @param sigma controls the strength of the blur (optional, default to 10)
   * @return ApiResponse&lt;InfoResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InfoResponse> blurpartialAsyncGetWithHttpInfo(String url, Integer x0, Integer x1, Integer y0, Integer y1, BigDecimal sigma) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = blurpartialAsyncGetRequestBuilder(url, x0, x1, y0, y1, sigma);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("blurpartialAsyncGet", localVarResponse);
        }
        return new ApiResponse<InfoResponse>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<InfoResponse>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder blurpartialAsyncGetRequestBuilder(String url, Integer x0, Integer x1, Integer y0, Integer y1, BigDecimal sigma) throws ApiException {
    // verify the required parameter 'url' is set
    if (url == null) {
      throw new ApiException(400, "Missing the required parameter 'url' when calling blurpartialAsyncGet");
    }
    // verify the required parameter 'x0' is set
    if (x0 == null) {
      throw new ApiException(400, "Missing the required parameter 'x0' when calling blurpartialAsyncGet");
    }
    // verify the required parameter 'x1' is set
    if (x1 == null) {
      throw new ApiException(400, "Missing the required parameter 'x1' when calling blurpartialAsyncGet");
    }
    // verify the required parameter 'y0' is set
    if (y0 == null) {
      throw new ApiException(400, "Missing the required parameter 'y0' when calling blurpartialAsyncGet");
    }
    // verify the required parameter 'y1' is set
    if (y1 == null) {
      throw new ApiException(400, "Missing the required parameter 'y1' when calling blurpartialAsyncGet");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/blurpartial";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "url";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("url", url));
    localVarQueryParameterBaseName = "sigma";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("sigma", sigma));
    localVarQueryParameterBaseName = "x0";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("x0", x0));
    localVarQueryParameterBaseName = "x1";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("x1", x1));
    localVarQueryParameterBaseName = "y0";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("y0", y0));
    localVarQueryParameterBaseName = "y1";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("y1", y1));

    if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      if (localVarQueryStringJoiner.length() != 0) {
        queryJoiner.add(localVarQueryStringJoiner.toString());
      }
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * 
   *  Blurs a fraction of the image defined by the rectangle (x0, y0, x1, y1)  ![blur_partial](https://api-docs.imager200.io/images/examples/blur_partial_example.jpeg)
   * @param x0 defines the x coordinate of the first point of the rectangle to blur (required)
   * @param x1 defines the x coordinate of the second point of the rectangle to blur (required)
   * @param y0 defines the y coordinate of the first point of the rectangle to blur (required)
   * @param y1 defines the y coordinate of the second point of the rectangle to blur. (required)
   * @param body image binary data, acceptable formats: jpeg,png,bmp (required)
   * @param sigma controls the strength of the blur (optional, default to 10)
   * @return InfoResponse
   * @throws ApiException if fails to make API call
   */
  public InfoResponse blurpartialAsyncPost(Integer x0, Integer x1, Integer y0, Integer y1, File body, BigDecimal sigma) throws ApiException {
    ApiResponse<InfoResponse> localVarResponse = blurpartialAsyncPostWithHttpInfo(x0, x1, y0, y1, body, sigma);
    return localVarResponse.getData();
  }

  /**
   * 
   *  Blurs a fraction of the image defined by the rectangle (x0, y0, x1, y1)  ![blur_partial](https://api-docs.imager200.io/images/examples/blur_partial_example.jpeg)
   * @param x0 defines the x coordinate of the first point of the rectangle to blur (required)
   * @param x1 defines the x coordinate of the second point of the rectangle to blur (required)
   * @param y0 defines the y coordinate of the first point of the rectangle to blur (required)
   * @param y1 defines the y coordinate of the second point of the rectangle to blur. (required)
   * @param body image binary data, acceptable formats: jpeg,png,bmp (required)
   * @param sigma controls the strength of the blur (optional, default to 10)
   * @return ApiResponse&lt;InfoResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InfoResponse> blurpartialAsyncPostWithHttpInfo(Integer x0, Integer x1, Integer y0, Integer y1, File body, BigDecimal sigma) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = blurpartialAsyncPostRequestBuilder(x0, x1, y0, y1, body, sigma);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("blurpartialAsyncPost", localVarResponse);
        }
        return new ApiResponse<InfoResponse>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<InfoResponse>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder blurpartialAsyncPostRequestBuilder(Integer x0, Integer x1, Integer y0, Integer y1, File body, BigDecimal sigma) throws ApiException {
    // verify the required parameter 'x0' is set
    if (x0 == null) {
      throw new ApiException(400, "Missing the required parameter 'x0' when calling blurpartialAsyncPost");
    }
    // verify the required parameter 'x1' is set
    if (x1 == null) {
      throw new ApiException(400, "Missing the required parameter 'x1' when calling blurpartialAsyncPost");
    }
    // verify the required parameter 'y0' is set
    if (y0 == null) {
      throw new ApiException(400, "Missing the required parameter 'y0' when calling blurpartialAsyncPost");
    }
    // verify the required parameter 'y1' is set
    if (y1 == null) {
      throw new ApiException(400, "Missing the required parameter 'y1' when calling blurpartialAsyncPost");
    }
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling blurpartialAsyncPost");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/blurpartial";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "sigma";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("sigma", sigma));
    localVarQueryParameterBaseName = "x0";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("x0", x0));
    localVarQueryParameterBaseName = "x1";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("x1", x1));
    localVarQueryParameterBaseName = "y0";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("y0", y0));
    localVarQueryParameterBaseName = "y1";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("y1", y1));

    if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      if (localVarQueryStringJoiner.length() != 0) {
        queryJoiner.add(localVarQueryStringJoiner.toString());
      }
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Content-Type", "application/octet-stream");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(body);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * 
   *  Blurs a fraction of the image defined by the rectangle (x0, y0, x1, y1)  ![blur_partial](https://api-docs.imager200.io/images/examples/blur_partial_example.jpeg)
   * @param url image url, supported formats jpeg,png,bmp (required)
   * @param x0 defines the x coordinate of the first point of the rectangle to blur (required)
   * @param x1 defines the x coordinate of the second point of the rectangle to blur (required)
   * @param y0 defines the y coordinate of the first point of the rectangle to blur (required)
   * @param y1 defines the y coordinate of the second point of the rectangle to blur. (required)
   * @param sigma controls the strength of the blur (optional, default to 10)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File blurpartialSyncGet(String url, Integer x0, Integer x1, Integer y0, Integer y1, BigDecimal sigma) throws ApiException {
    ApiResponse<File> localVarResponse = blurpartialSyncGetWithHttpInfo(url, x0, x1, y0, y1, sigma);
    return localVarResponse.getData();
  }

  /**
   * 
   *  Blurs a fraction of the image defined by the rectangle (x0, y0, x1, y1)  ![blur_partial](https://api-docs.imager200.io/images/examples/blur_partial_example.jpeg)
   * @param url image url, supported formats jpeg,png,bmp (required)
   * @param x0 defines the x coordinate of the first point of the rectangle to blur (required)
   * @param x1 defines the x coordinate of the second point of the rectangle to blur (required)
   * @param y0 defines the y coordinate of the first point of the rectangle to blur (required)
   * @param y1 defines the y coordinate of the second point of the rectangle to blur. (required)
   * @param sigma controls the strength of the blur (optional, default to 10)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<File> blurpartialSyncGetWithHttpInfo(String url, Integer x0, Integer x1, Integer y0, Integer y1, BigDecimal sigma) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = blurpartialSyncGetRequestBuilder(url, x0, x1, y0, y1, sigma);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("blurpartialSyncGet", localVarResponse);
        }
        return new ApiResponse<File>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<File>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder blurpartialSyncGetRequestBuilder(String url, Integer x0, Integer x1, Integer y0, Integer y1, BigDecimal sigma) throws ApiException {
    // verify the required parameter 'url' is set
    if (url == null) {
      throw new ApiException(400, "Missing the required parameter 'url' when calling blurpartialSyncGet");
    }
    // verify the required parameter 'x0' is set
    if (x0 == null) {
      throw new ApiException(400, "Missing the required parameter 'x0' when calling blurpartialSyncGet");
    }
    // verify the required parameter 'x1' is set
    if (x1 == null) {
      throw new ApiException(400, "Missing the required parameter 'x1' when calling blurpartialSyncGet");
    }
    // verify the required parameter 'y0' is set
    if (y0 == null) {
      throw new ApiException(400, "Missing the required parameter 'y0' when calling blurpartialSyncGet");
    }
    // verify the required parameter 'y1' is set
    if (y1 == null) {
      throw new ApiException(400, "Missing the required parameter 'y1' when calling blurpartialSyncGet");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/blurpartial/sync";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "url";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("url", url));
    localVarQueryParameterBaseName = "sigma";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("sigma", sigma));
    localVarQueryParameterBaseName = "x0";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("x0", x0));
    localVarQueryParameterBaseName = "x1";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("x1", x1));
    localVarQueryParameterBaseName = "y0";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("y0", y0));
    localVarQueryParameterBaseName = "y1";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("y1", y1));

    if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      if (localVarQueryStringJoiner.length() != 0) {
        queryJoiner.add(localVarQueryStringJoiner.toString());
      }
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "image/bmp, image/jpeg, image/png, application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * 
   *  Blurs a fraction of the image defined by the rectangle (x0, y0, x1, y1)  ![blur_partial](https://api-docs.imager200.io/images/examples/blur_partial_example.jpeg)
   * @param x0 defines the x coordinate of the first point of the rectangle to blur (required)
   * @param x1 defines the x coordinate of the second point of the rectangle to blur (required)
   * @param y0 defines the y coordinate of the first point of the rectangle to blur (required)
   * @param y1 defines the y coordinate of the second point of the rectangle to blur. (required)
   * @param body image binary data, acceptable formats: jpeg,png,bmp (required)
   * @param sigma controls the strength of the blur (optional, default to 10)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File blurpartialSyncPost(Integer x0, Integer x1, Integer y0, Integer y1, File body, BigDecimal sigma) throws ApiException {
    ApiResponse<File> localVarResponse = blurpartialSyncPostWithHttpInfo(x0, x1, y0, y1, body, sigma);
    return localVarResponse.getData();
  }

  /**
   * 
   *  Blurs a fraction of the image defined by the rectangle (x0, y0, x1, y1)  ![blur_partial](https://api-docs.imager200.io/images/examples/blur_partial_example.jpeg)
   * @param x0 defines the x coordinate of the first point of the rectangle to blur (required)
   * @param x1 defines the x coordinate of the second point of the rectangle to blur (required)
   * @param y0 defines the y coordinate of the first point of the rectangle to blur (required)
   * @param y1 defines the y coordinate of the second point of the rectangle to blur. (required)
   * @param body image binary data, acceptable formats: jpeg,png,bmp (required)
   * @param sigma controls the strength of the blur (optional, default to 10)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<File> blurpartialSyncPostWithHttpInfo(Integer x0, Integer x1, Integer y0, Integer y1, File body, BigDecimal sigma) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = blurpartialSyncPostRequestBuilder(x0, x1, y0, y1, body, sigma);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("blurpartialSyncPost", localVarResponse);
        }
        return new ApiResponse<File>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<File>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder blurpartialSyncPostRequestBuilder(Integer x0, Integer x1, Integer y0, Integer y1, File body, BigDecimal sigma) throws ApiException {
    // verify the required parameter 'x0' is set
    if (x0 == null) {
      throw new ApiException(400, "Missing the required parameter 'x0' when calling blurpartialSyncPost");
    }
    // verify the required parameter 'x1' is set
    if (x1 == null) {
      throw new ApiException(400, "Missing the required parameter 'x1' when calling blurpartialSyncPost");
    }
    // verify the required parameter 'y0' is set
    if (y0 == null) {
      throw new ApiException(400, "Missing the required parameter 'y0' when calling blurpartialSyncPost");
    }
    // verify the required parameter 'y1' is set
    if (y1 == null) {
      throw new ApiException(400, "Missing the required parameter 'y1' when calling blurpartialSyncPost");
    }
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling blurpartialSyncPost");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/blurpartial/sync";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "sigma";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("sigma", sigma));
    localVarQueryParameterBaseName = "x0";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("x0", x0));
    localVarQueryParameterBaseName = "x1";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("x1", x1));
    localVarQueryParameterBaseName = "y0";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("y0", y0));
    localVarQueryParameterBaseName = "y1";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("y1", y1));

    if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      if (localVarQueryStringJoiner.length() != 0) {
        queryJoiner.add(localVarQueryStringJoiner.toString());
      }
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Content-Type", "application/octet-stream");
    localVarRequestBuilder.header("Accept", "image/bmp, image/jpeg, image/png, application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(body);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

}
