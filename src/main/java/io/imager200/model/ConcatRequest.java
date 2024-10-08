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


package io.imager200.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import io.imager200.ApiClient;
/**
 * ConcatRequest
 */
@JsonPropertyOrder({
  ConcatRequest.JSON_PROPERTY_CONCAT_MODE,
  ConcatRequest.JSON_PROPERTY_DIRECTION,
  ConcatRequest.JSON_PROPERTY_IMAGE1,
  ConcatRequest.JSON_PROPERTY_IMAGE2,
  ConcatRequest.JSON_PROPERTY_TARGET_FORMAT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-09T18:04:56.023056641+02:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class ConcatRequest {
  /**
   * Defines whether the result image will be resized to the smaller one or the larger one in case both images have different dimensions. It has not effect if images have the same dimensions.
   */
  public enum ConcatModeEnum {
    NONE("none"),
    
    RTS("rts"),
    
    RTL("rtl");

    private String value;

    ConcatModeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ConcatModeEnum fromValue(String value) {
      for (ConcatModeEnum b : ConcatModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CONCAT_MODE = "concatMode";
  private ConcatModeEnum concatMode = ConcatModeEnum.NONE;

  /**
   * This parameter defines how the images will be concatenated. horizontal means that the images will concatenated one beside the other from left to right. vertical means that images will be concatenated one on the top of the other
   */
  public enum DirectionEnum {
    HOR("hor"),
    
    VER("ver");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DirectionEnum fromValue(String value) {
      for (DirectionEnum b : DirectionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DIRECTION = "direction";
  private DirectionEnum direction = DirectionEnum.HOR;

  public static final String JSON_PROPERTY_IMAGE1 = "image1";
  private String image1;

  public static final String JSON_PROPERTY_IMAGE2 = "image2";
  private String image2;

  /**
   * Gets or Sets targetFormat
   */
  public enum TargetFormatEnum {
    JPEG("jpeg"),
    
    PNG("png"),
    
    BMP("bmp"),
    
    GIF("gif");

    private String value;

    TargetFormatEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TargetFormatEnum fromValue(String value) {
      for (TargetFormatEnum b : TargetFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TARGET_FORMAT = "targetFormat";
  private TargetFormatEnum targetFormat = TargetFormatEnum.JPEG;

  public ConcatRequest() { 
  }

  public ConcatRequest concatMode(ConcatModeEnum concatMode) {
    this.concatMode = concatMode;
    return this;
  }

  /**
   * Defines whether the result image will be resized to the smaller one or the larger one in case both images have different dimensions. It has not effect if images have the same dimensions.
   * @return concatMode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONCAT_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ConcatModeEnum getConcatMode() {
    return concatMode;
  }


  @JsonProperty(JSON_PROPERTY_CONCAT_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConcatMode(ConcatModeEnum concatMode) {
    this.concatMode = concatMode;
  }


  public ConcatRequest direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }

  /**
   * This parameter defines how the images will be concatenated. horizontal means that the images will concatenated one beside the other from left to right. vertical means that images will be concatenated one on the top of the other
   * @return direction
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DirectionEnum getDirection() {
    return direction;
  }


  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }


  public ConcatRequest image1(String image1) {
    this.image1 = image1;
    return this;
  }

  /**
   * Get image1
   * @return image1
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAGE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getImage1() {
    return image1;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImage1(String image1) {
    this.image1 = image1;
  }


  public ConcatRequest image2(String image2) {
    this.image2 = image2;
    return this;
  }

  /**
   * Get image2
   * @return image2
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAGE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getImage2() {
    return image2;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImage2(String image2) {
    this.image2 = image2;
  }


  public ConcatRequest targetFormat(TargetFormatEnum targetFormat) {
    this.targetFormat = targetFormat;
    return this;
  }

  /**
   * Get targetFormat
   * @return targetFormat
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TargetFormatEnum getTargetFormat() {
    return targetFormat;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetFormat(TargetFormatEnum targetFormat) {
    this.targetFormat = targetFormat;
  }


  /**
   * Return true if this concat.Request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConcatRequest concatRequest = (ConcatRequest) o;
    return Objects.equals(this.concatMode, concatRequest.concatMode) &&
        Objects.equals(this.direction, concatRequest.direction) &&
        Objects.equals(this.image1, concatRequest.image1) &&
        Objects.equals(this.image2, concatRequest.image2) &&
        Objects.equals(this.targetFormat, concatRequest.targetFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(concatMode, direction, image1, image2, targetFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConcatRequest {\n");
    sb.append("    concatMode: ").append(toIndentedString(concatMode)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    image1: ").append(toIndentedString(image1)).append("\n");
    sb.append("    image2: ").append(toIndentedString(image2)).append("\n");
    sb.append("    targetFormat: ").append(toIndentedString(targetFormat)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `concatMode` to the URL query string
    if (getConcatMode() != null) {
      joiner.add(String.format("%sconcatMode%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getConcatMode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `direction` to the URL query string
    if (getDirection() != null) {
      joiner.add(String.format("%sdirection%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDirection()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `image1` to the URL query string
    if (getImage1() != null) {
      joiner.add(String.format("%simage1%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getImage1()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `image2` to the URL query string
    if (getImage2() != null) {
      joiner.add(String.format("%simage2%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getImage2()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `targetFormat` to the URL query string
    if (getTargetFormat() != null) {
      joiner.add(String.format("%stargetFormat%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getTargetFormat()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

