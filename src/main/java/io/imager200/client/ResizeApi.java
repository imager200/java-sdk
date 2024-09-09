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
public class ResizeApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public ResizeApi() {
    this(new ApiClient());
  }

  public ResizeApi(ApiClient apiClient) {
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
   * ![resize](https://api-docs.imager200.io/images/examples/thumbs-up.png)
   * @param url image url, supported formats jpeg,png,bmp,gif (required)
   * @param height  (required)
   * @param width  (required)
   * @param resamplingAlgorithm It allows changing the resampling algorithm used when resizing (resampling) the image. (optional, default to lanczos)
   * @return InfoResponse
   * @throws ApiException if fails to make API call
   */
  public InfoResponse resizeAsyncGet(String url, Integer height, Integer width, String resamplingAlgorithm) throws ApiException {
    ApiResponse<InfoResponse> localVarResponse = resizeAsyncGetWithHttpInfo(url, height, width, resamplingAlgorithm);
    return localVarResponse.getData();
  }

  /**
   * 
   * ![resize](https://api-docs.imager200.io/images/examples/thumbs-up.png)
   * @param url image url, supported formats jpeg,png,bmp,gif (required)
   * @param height  (required)
   * @param width  (required)
   * @param resamplingAlgorithm It allows changing the resampling algorithm used when resizing (resampling) the image. (optional, default to lanczos)
   * @return ApiResponse&lt;InfoResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InfoResponse> resizeAsyncGetWithHttpInfo(String url, Integer height, Integer width, String resamplingAlgorithm) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = resizeAsyncGetRequestBuilder(url, height, width, resamplingAlgorithm);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("resizeAsyncGet", localVarResponse);
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

  private HttpRequest.Builder resizeAsyncGetRequestBuilder(String url, Integer height, Integer width, String resamplingAlgorithm) throws ApiException {
    // verify the required parameter 'url' is set
    if (url == null) {
      throw new ApiException(400, "Missing the required parameter 'url' when calling resizeAsyncGet");
    }
    // verify the required parameter 'height' is set
    if (height == null) {
      throw new ApiException(400, "Missing the required parameter 'height' when calling resizeAsyncGet");
    }
    // verify the required parameter 'width' is set
    if (width == null) {
      throw new ApiException(400, "Missing the required parameter 'width' when calling resizeAsyncGet");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/resize";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "url";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("url", url));
    localVarQueryParameterBaseName = "height";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("height", height));
    localVarQueryParameterBaseName = "resamplingAlgorithm";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("resamplingAlgorithm", resamplingAlgorithm));
    localVarQueryParameterBaseName = "width";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("width", width));

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
   * ![resize](https://api-docs.imager200.io/images/examples/thumbs-up.png)
   * @param height  (required)
   * @param width  (required)
   * @param body image binary data, acceptable formats: jpeg,png,bmp,gif (required)
   * @param resamplingAlgorithm It allows changing the resampling algorithm used when resizing (resampling) the image. (optional, default to lanczos)
   * @return InfoResponse
   * @throws ApiException if fails to make API call
   */
  public InfoResponse resizeAsyncPost(Integer height, Integer width, File body, String resamplingAlgorithm) throws ApiException {
    ApiResponse<InfoResponse> localVarResponse = resizeAsyncPostWithHttpInfo(height, width, body, resamplingAlgorithm);
    return localVarResponse.getData();
  }

  /**
   * 
   * ![resize](https://api-docs.imager200.io/images/examples/thumbs-up.png)
   * @param height  (required)
   * @param width  (required)
   * @param body image binary data, acceptable formats: jpeg,png,bmp,gif (required)
   * @param resamplingAlgorithm It allows changing the resampling algorithm used when resizing (resampling) the image. (optional, default to lanczos)
   * @return ApiResponse&lt;InfoResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InfoResponse> resizeAsyncPostWithHttpInfo(Integer height, Integer width, File body, String resamplingAlgorithm) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = resizeAsyncPostRequestBuilder(height, width, body, resamplingAlgorithm);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("resizeAsyncPost", localVarResponse);
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

  private HttpRequest.Builder resizeAsyncPostRequestBuilder(Integer height, Integer width, File body, String resamplingAlgorithm) throws ApiException {
    // verify the required parameter 'height' is set
    if (height == null) {
      throw new ApiException(400, "Missing the required parameter 'height' when calling resizeAsyncPost");
    }
    // verify the required parameter 'width' is set
    if (width == null) {
      throw new ApiException(400, "Missing the required parameter 'width' when calling resizeAsyncPost");
    }
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling resizeAsyncPost");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/resize";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "height";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("height", height));
    localVarQueryParameterBaseName = "resamplingAlgorithm";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("resamplingAlgorithm", resamplingAlgorithm));
    localVarQueryParameterBaseName = "width";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("width", width));

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
   * ![resize](https://api-docs.imager200.io/images/examples/thumbs-up.png)
   * @param url image url, supported formats jpeg,png,bmp,gif (required)
   * @param height  (required)
   * @param width  (required)
   * @param resamplingAlgorithm It allows changing the resampling algorithm used when resizing (resampling) the image. (optional, default to lanczos)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File resizeSyncGet(String url, Integer height, Integer width, String resamplingAlgorithm) throws ApiException {
    ApiResponse<File> localVarResponse = resizeSyncGetWithHttpInfo(url, height, width, resamplingAlgorithm);
    return localVarResponse.getData();
  }

  /**
   * 
   * ![resize](https://api-docs.imager200.io/images/examples/thumbs-up.png)
   * @param url image url, supported formats jpeg,png,bmp,gif (required)
   * @param height  (required)
   * @param width  (required)
   * @param resamplingAlgorithm It allows changing the resampling algorithm used when resizing (resampling) the image. (optional, default to lanczos)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<File> resizeSyncGetWithHttpInfo(String url, Integer height, Integer width, String resamplingAlgorithm) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = resizeSyncGetRequestBuilder(url, height, width, resamplingAlgorithm);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("resizeSyncGet", localVarResponse);
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

  private HttpRequest.Builder resizeSyncGetRequestBuilder(String url, Integer height, Integer width, String resamplingAlgorithm) throws ApiException {
    // verify the required parameter 'url' is set
    if (url == null) {
      throw new ApiException(400, "Missing the required parameter 'url' when calling resizeSyncGet");
    }
    // verify the required parameter 'height' is set
    if (height == null) {
      throw new ApiException(400, "Missing the required parameter 'height' when calling resizeSyncGet");
    }
    // verify the required parameter 'width' is set
    if (width == null) {
      throw new ApiException(400, "Missing the required parameter 'width' when calling resizeSyncGet");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/resize/sync";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "url";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("url", url));
    localVarQueryParameterBaseName = "height";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("height", height));
    localVarQueryParameterBaseName = "resamplingAlgorithm";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("resamplingAlgorithm", resamplingAlgorithm));
    localVarQueryParameterBaseName = "width";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("width", width));

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

    localVarRequestBuilder.header("Accept", "image/bmp, image/gif, image/jpeg, image/png, application/json");

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
   * ![resize](https://api-docs.imager200.io/images/examples/thumbs-up.png)
   * @param height  (required)
   * @param width  (required)
   * @param body image binary data, acceptable formats: jpeg,png,bmp,gif (required)
   * @param resamplingAlgorithm It allows changing the resampling algorithm used when resizing (resampling) the image. (optional, default to lanczos)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File resizeSyncPost(Integer height, Integer width, File body, String resamplingAlgorithm) throws ApiException {
    ApiResponse<File> localVarResponse = resizeSyncPostWithHttpInfo(height, width, body, resamplingAlgorithm);
    return localVarResponse.getData();
  }

  /**
   * 
   * ![resize](https://api-docs.imager200.io/images/examples/thumbs-up.png)
   * @param height  (required)
   * @param width  (required)
   * @param body image binary data, acceptable formats: jpeg,png,bmp,gif (required)
   * @param resamplingAlgorithm It allows changing the resampling algorithm used when resizing (resampling) the image. (optional, default to lanczos)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<File> resizeSyncPostWithHttpInfo(Integer height, Integer width, File body, String resamplingAlgorithm) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = resizeSyncPostRequestBuilder(height, width, body, resamplingAlgorithm);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("resizeSyncPost", localVarResponse);
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

  private HttpRequest.Builder resizeSyncPostRequestBuilder(Integer height, Integer width, File body, String resamplingAlgorithm) throws ApiException {
    // verify the required parameter 'height' is set
    if (height == null) {
      throw new ApiException(400, "Missing the required parameter 'height' when calling resizeSyncPost");
    }
    // verify the required parameter 'width' is set
    if (width == null) {
      throw new ApiException(400, "Missing the required parameter 'width' when calling resizeSyncPost");
    }
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling resizeSyncPost");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/resize/sync";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "height";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("height", height));
    localVarQueryParameterBaseName = "resamplingAlgorithm";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("resamplingAlgorithm", resamplingAlgorithm));
    localVarQueryParameterBaseName = "width";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("width", width));

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
    localVarRequestBuilder.header("Accept", "image/bmp, image/gif, image/jpeg, image/png, application/json");

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
