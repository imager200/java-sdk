/*
 * imager200 API
 *   Welcome to imager200! the API for image processing and image workflow automation.        You can find detailed specification of each endpoint and usage examples.      All endpoints  have synchronous (`/{endpoint}/sync`) and asynchronous (`/{endpoint}`) versions. Synchronous endpoints returns the result image in the body of the response (and thus the response is suspended until the processing is finished). The asynchronous endpoint returns immediately and processes the image asap. The image is stored according to the provided `post operation` configuration or stored in our temporary storage where the `Location` header specifies the exact location. More details on post operations can be found on the getting started [guides](/getting-started)    Most endpoints (except `/blend`, `/concat`) allow to send the image either in the body of the request (POST endpoints) or send only the url of the image (GET endpoints) to be downloaded and processed by the API.     Therefore there are 4 possibilities for most endpoints `GET /{endpoint}?url={imageUrl}`, `GET /{endpoint}/sync?url={imageUrl}`, `POST /{endpoint}/sync`, `POST /{endpoint}`    If you find some outdated or inacurate information. Please let us know anytime at [contact@imager200.io](mailto:contact@imager200.io)  ## Authentication:  All API requests need to have an `X-Imager-Key` header with your provided API key as a value otherwise 401 will be returned.   Your API key can be obtained from the [control panel](https://panel.imager200.io) once you sign up. More details can be found on the getting started [guides](/getting-started).  It's possible to test the API without registration using the [guest API key](#api-key), which can be found above the Authorize section below. Note that the guest API key expires every 10 mins and is only used for testing purposes. For a permanent API key, a sign up is needed.    ## Common headers:  | Name | Description | | ---- | ----------- | | X-Imager-Key | Contains the API key. should be part of every request  | | X-PostOp-Id | Optional. Only used in async endpoints. It contains the post operation id that should be applied after processing the image | | X-Upload-File-Name  | Optional. Can be used to give the stored image a name instead of a random / the configured one. The value in this header takes precedence over the file naming convention configured in the post operation. **The value should contain the file name only without extension.**  | | X-Imgur-Title  | **Available in case an imgur post operation is used.** Optional header to set the image title in imgur. The value in the header takes precedence over the stored configuration. | | X-Imgur-Description  | **Available in case an imgur post operation is used.** Optional header to set the image description in imgur. The value in the header takes precedence over the stored configuration. | | X-GPhoto-Description  | **Available in case a google photo post operation is used.** Optional header to set the image description in google photo. |  ## Common Responses:  | Status | Description | | ------ | ----------- | | 402 | indicates that something is wrong with your subscription: either your subscription payment is past due or you have exceeded the maximum allowed requests by your plan.  | | 503 | error that indicates an unreachable service (usually the authentication server) | | 401 | indicates that your API key is wrong or missing | | 400 | validation error specific to the endpoint parameters. Can also indicate that the `X-PostOp-Id` value is not found or the image format is not valid or unsupported | | 201 | returned by async endpoints to indicate that requests has been received and being processed. It does not necessarily mean the success of the operation.  | | 200 | returned by sync endpoints. Means that the request has succeeded and the result is in the response body. |  ## Mime types:  When submitting an image to an endpoint, the content type can be of type `application/octet-stream` or `image/_*`.  ## Post Operations:  Because many post operations require the OAuth flow for obtaining the access token to the storage provider API, the creation of post operations can only be done manually through the [control panel](https://panel.imager200.io).  The current integrations are available:  * Dropbox  * Google Drive  * Google Photos  * Google Cloud storage (suspended temporarily because of Google verification)  * AWS S3  * SCP (secure copy)  * Microsoft OneDrive  * Microsoft Azure Storage  * imgur  * http (send the image to a defined http address)  The getting started [guides](/getting-started) contains detailed usage examples and video demos for each post operation.   ## Pipelines:  pipelines can be invoked throught the API, but can only be created through the [control panel](https://panel.imager200.io). The getting started [guides](/getting-started) describes the pipelines inner workings in details.   ## Limits  For security measures and for avoiding server overload, endpoints have the following limits:  - Max image width: 4096 pixels - Max image height: 4096 pixels - Max image size: 20MB - Requests per second: 15 - Max connections from one host: 10  If you need an increase in the limits, please let us know by creating a ticket from the control panel.  ## Reference image:  This image will be used in all the examples for the endpoints below.   ![reference_image](https://api-docs.imager200.io/images/examples/jpeg_image.jpg)  
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
import java.math.BigDecimal;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import io.imager200.ApiClient;
/**
 * ImageMetadata
 */
@JsonPropertyOrder({
  ImageMetadata.JSON_PROPERTY_BACKGROUND_COLOR,
  ImageMetadata.JSON_PROPERTY_BORDER_COLOR,
  ImageMetadata.JSON_PROPERTY_PROPERTY_CLASS,
  ImageMetadata.JSON_PROPERTY_COLORSPACE,
  ImageMetadata.JSON_PROPERTY_COMPOSE,
  ImageMetadata.JSON_PROPERTY_COMPRESSION,
  ImageMetadata.JSON_PROPERTY_DEPTH_IN_BITS,
  ImageMetadata.JSON_PROPERTY_DISPOSE,
  ImageMetadata.JSON_PROPERTY_ENDIANNESS,
  ImageMetadata.JSON_PROPERTY_FORMAT,
  ImageMetadata.JSON_PROPERTY_GAMMA,
  ImageMetadata.JSON_PROPERTY_GEOMETRY,
  ImageMetadata.JSON_PROPERTY_INTENSITY,
  ImageMetadata.JSON_PROPERTY_INTERLACE,
  ImageMetadata.JSON_PROPERTY_ITERATIONS,
  ImageMetadata.JSON_PROPERTY_MATTE_COLOR,
  ImageMetadata.JSON_PROPERTY_NUMBER_OF_PIXELS,
  ImageMetadata.JSON_PROPERTY_ORIENTATION,
  ImageMetadata.JSON_PROPERTY_PAGE_GEOMETRY,
  ImageMetadata.JSON_PROPERTY_RENDERING_INTENT,
  ImageMetadata.JSON_PROPERTY_SIZE_IN_BYTES,
  ImageMetadata.JSON_PROPERTY_TAINTED,
  ImageMetadata.JSON_PROPERTY_TRANSPARENT_COLOR,
  ImageMetadata.JSON_PROPERTY_TYPE,
  ImageMetadata.JSON_PROPERTY_UNITS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-29T18:57:06.392073472+02:00[Europe/Berlin]", comments = "Generator version: 7.8.0")
public class ImageMetadata {
  public static final String JSON_PROPERTY_BACKGROUND_COLOR = "backgroundColor";
  private String backgroundColor;

  public static final String JSON_PROPERTY_BORDER_COLOR = "borderColor";
  private String borderColor;

  public static final String JSON_PROPERTY_PROPERTY_CLASS = "class";
  private String propertyClass;

  public static final String JSON_PROPERTY_COLORSPACE = "colorspace";
  private String colorspace;

  public static final String JSON_PROPERTY_COMPOSE = "compose";
  private String compose;

  public static final String JSON_PROPERTY_COMPRESSION = "compression";
  private String compression;

  public static final String JSON_PROPERTY_DEPTH_IN_BITS = "depthInBits";
  private BigDecimal depthInBits;

  public static final String JSON_PROPERTY_DISPOSE = "dispose";
  private String dispose;

  public static final String JSON_PROPERTY_ENDIANNESS = "endianness";
  private String endianness;

  public static final String JSON_PROPERTY_FORMAT = "format";
  private String format;

  public static final String JSON_PROPERTY_GAMMA = "gamma";
  private BigDecimal gamma;

  public static final String JSON_PROPERTY_GEOMETRY = "geometry";
  private String geometry;

  public static final String JSON_PROPERTY_INTENSITY = "intensity";
  private String intensity;

  public static final String JSON_PROPERTY_INTERLACE = "interlace";
  private String interlace;

  public static final String JSON_PROPERTY_ITERATIONS = "iterations";
  private BigDecimal iterations;

  public static final String JSON_PROPERTY_MATTE_COLOR = "matteColor";
  private String matteColor;

  public static final String JSON_PROPERTY_NUMBER_OF_PIXELS = "numberOfPixels";
  private BigDecimal numberOfPixels;

  public static final String JSON_PROPERTY_ORIENTATION = "orientation";
  private String orientation;

  public static final String JSON_PROPERTY_PAGE_GEOMETRY = "pageGeometry";
  private String pageGeometry;

  public static final String JSON_PROPERTY_RENDERING_INTENT = "renderingIntent";
  private String renderingIntent;

  public static final String JSON_PROPERTY_SIZE_IN_BYTES = "sizeInBytes";
  private BigDecimal sizeInBytes;

  public static final String JSON_PROPERTY_TAINTED = "tainted";
  private String tainted;

  public static final String JSON_PROPERTY_TRANSPARENT_COLOR = "transparentColor";
  private String transparentColor;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_UNITS = "units";
  private String units;

  public ImageMetadata() { 
  }

  public ImageMetadata backgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

  /**
   * Get backgroundColor
   * @return backgroundColor
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BACKGROUND_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBackgroundColor() {
    return backgroundColor;
  }


  @JsonProperty(JSON_PROPERTY_BACKGROUND_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }


  public ImageMetadata borderColor(String borderColor) {
    this.borderColor = borderColor;
    return this;
  }

  /**
   * Get borderColor
   * @return borderColor
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BORDER_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBorderColor() {
    return borderColor;
  }


  @JsonProperty(JSON_PROPERTY_BORDER_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBorderColor(String borderColor) {
    this.borderColor = borderColor;
  }


  public ImageMetadata propertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

  /**
   * Get propertyClass
   * @return propertyClass
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROPERTY_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPropertyClass() {
    return propertyClass;
  }


  @JsonProperty(JSON_PROPERTY_PROPERTY_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPropertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
  }


  public ImageMetadata colorspace(String colorspace) {
    this.colorspace = colorspace;
    return this;
  }

  /**
   * Get colorspace
   * @return colorspace
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLORSPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getColorspace() {
    return colorspace;
  }


  @JsonProperty(JSON_PROPERTY_COLORSPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setColorspace(String colorspace) {
    this.colorspace = colorspace;
  }


  public ImageMetadata compose(String compose) {
    this.compose = compose;
    return this;
  }

  /**
   * Get compose
   * @return compose
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPOSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCompose() {
    return compose;
  }


  @JsonProperty(JSON_PROPERTY_COMPOSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompose(String compose) {
    this.compose = compose;
  }


  public ImageMetadata compression(String compression) {
    this.compression = compression;
    return this;
  }

  /**
   * Get compression
   * @return compression
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPRESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCompression() {
    return compression;
  }


  @JsonProperty(JSON_PROPERTY_COMPRESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompression(String compression) {
    this.compression = compression;
  }


  public ImageMetadata depthInBits(BigDecimal depthInBits) {
    this.depthInBits = depthInBits;
    return this;
  }

  /**
   * Get depthInBits
   * @return depthInBits
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEPTH_IN_BITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public BigDecimal getDepthInBits() {
    return depthInBits;
  }


  @JsonProperty(JSON_PROPERTY_DEPTH_IN_BITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDepthInBits(BigDecimal depthInBits) {
    this.depthInBits = depthInBits;
  }


  public ImageMetadata dispose(String dispose) {
    this.dispose = dispose;
    return this;
  }

  /**
   * Get dispose
   * @return dispose
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPOSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDispose() {
    return dispose;
  }


  @JsonProperty(JSON_PROPERTY_DISPOSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDispose(String dispose) {
    this.dispose = dispose;
  }


  public ImageMetadata endianness(String endianness) {
    this.endianness = endianness;
    return this;
  }

  /**
   * Get endianness
   * @return endianness
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENDIANNESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEndianness() {
    return endianness;
  }


  @JsonProperty(JSON_PROPERTY_ENDIANNESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndianness(String endianness) {
    this.endianness = endianness;
  }


  public ImageMetadata format(String format) {
    this.format = format;
    return this;
  }

  /**
   * Get format
   * @return format
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFormat() {
    return format;
  }


  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormat(String format) {
    this.format = format;
  }


  public ImageMetadata gamma(BigDecimal gamma) {
    this.gamma = gamma;
    return this;
  }

  /**
   * Get gamma
   * @return gamma
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GAMMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public BigDecimal getGamma() {
    return gamma;
  }


  @JsonProperty(JSON_PROPERTY_GAMMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGamma(BigDecimal gamma) {
    this.gamma = gamma;
  }


  public ImageMetadata geometry(String geometry) {
    this.geometry = geometry;
    return this;
  }

  /**
   * Get geometry
   * @return geometry
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GEOMETRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getGeometry() {
    return geometry;
  }


  @JsonProperty(JSON_PROPERTY_GEOMETRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGeometry(String geometry) {
    this.geometry = geometry;
  }


  public ImageMetadata intensity(String intensity) {
    this.intensity = intensity;
    return this;
  }

  /**
   * Get intensity
   * @return intensity
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTENSITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIntensity() {
    return intensity;
  }


  @JsonProperty(JSON_PROPERTY_INTENSITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntensity(String intensity) {
    this.intensity = intensity;
  }


  public ImageMetadata interlace(String interlace) {
    this.interlace = interlace;
    return this;
  }

  /**
   * Get interlace
   * @return interlace
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERLACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getInterlace() {
    return interlace;
  }


  @JsonProperty(JSON_PROPERTY_INTERLACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterlace(String interlace) {
    this.interlace = interlace;
  }


  public ImageMetadata iterations(BigDecimal iterations) {
    this.iterations = iterations;
    return this;
  }

  /**
   * Get iterations
   * @return iterations
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ITERATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public BigDecimal getIterations() {
    return iterations;
  }


  @JsonProperty(JSON_PROPERTY_ITERATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIterations(BigDecimal iterations) {
    this.iterations = iterations;
  }


  public ImageMetadata matteColor(String matteColor) {
    this.matteColor = matteColor;
    return this;
  }

  /**
   * Get matteColor
   * @return matteColor
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MATTE_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMatteColor() {
    return matteColor;
  }


  @JsonProperty(JSON_PROPERTY_MATTE_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatteColor(String matteColor) {
    this.matteColor = matteColor;
  }


  public ImageMetadata numberOfPixels(BigDecimal numberOfPixels) {
    this.numberOfPixels = numberOfPixels;
    return this;
  }

  /**
   * Get numberOfPixels
   * @return numberOfPixels
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_PIXELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public BigDecimal getNumberOfPixels() {
    return numberOfPixels;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_PIXELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfPixels(BigDecimal numberOfPixels) {
    this.numberOfPixels = numberOfPixels;
  }


  public ImageMetadata orientation(String orientation) {
    this.orientation = orientation;
    return this;
  }

  /**
   * Get orientation
   * @return orientation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORIENTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOrientation() {
    return orientation;
  }


  @JsonProperty(JSON_PROPERTY_ORIENTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrientation(String orientation) {
    this.orientation = orientation;
  }


  public ImageMetadata pageGeometry(String pageGeometry) {
    this.pageGeometry = pageGeometry;
    return this;
  }

  /**
   * Get pageGeometry
   * @return pageGeometry
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE_GEOMETRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPageGeometry() {
    return pageGeometry;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_GEOMETRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageGeometry(String pageGeometry) {
    this.pageGeometry = pageGeometry;
  }


  public ImageMetadata renderingIntent(String renderingIntent) {
    this.renderingIntent = renderingIntent;
    return this;
  }

  /**
   * Get renderingIntent
   * @return renderingIntent
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RENDERING_INTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRenderingIntent() {
    return renderingIntent;
  }


  @JsonProperty(JSON_PROPERTY_RENDERING_INTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRenderingIntent(String renderingIntent) {
    this.renderingIntent = renderingIntent;
  }


  public ImageMetadata sizeInBytes(BigDecimal sizeInBytes) {
    this.sizeInBytes = sizeInBytes;
    return this;
  }

  /**
   * Get sizeInBytes
   * @return sizeInBytes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIZE_IN_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public BigDecimal getSizeInBytes() {
    return sizeInBytes;
  }


  @JsonProperty(JSON_PROPERTY_SIZE_IN_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSizeInBytes(BigDecimal sizeInBytes) {
    this.sizeInBytes = sizeInBytes;
  }


  public ImageMetadata tainted(String tainted) {
    this.tainted = tainted;
    return this;
  }

  /**
   * Get tainted
   * @return tainted
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAINTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTainted() {
    return tainted;
  }


  @JsonProperty(JSON_PROPERTY_TAINTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTainted(String tainted) {
    this.tainted = tainted;
  }


  public ImageMetadata transparentColor(String transparentColor) {
    this.transparentColor = transparentColor;
    return this;
  }

  /**
   * Get transparentColor
   * @return transparentColor
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSPARENT_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTransparentColor() {
    return transparentColor;
  }


  @JsonProperty(JSON_PROPERTY_TRANSPARENT_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransparentColor(String transparentColor) {
    this.transparentColor = transparentColor;
  }


  public ImageMetadata type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public ImageMetadata units(String units) {
    this.units = units;
    return this;
  }

  /**
   * Get units
   * @return units
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUnits() {
    return units;
  }


  @JsonProperty(JSON_PROPERTY_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnits(String units) {
    this.units = units;
  }


  /**
   * Return true if this ImageMetadata object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageMetadata imageMetadata = (ImageMetadata) o;
    return Objects.equals(this.backgroundColor, imageMetadata.backgroundColor) &&
        Objects.equals(this.borderColor, imageMetadata.borderColor) &&
        Objects.equals(this.propertyClass, imageMetadata.propertyClass) &&
        Objects.equals(this.colorspace, imageMetadata.colorspace) &&
        Objects.equals(this.compose, imageMetadata.compose) &&
        Objects.equals(this.compression, imageMetadata.compression) &&
        Objects.equals(this.depthInBits, imageMetadata.depthInBits) &&
        Objects.equals(this.dispose, imageMetadata.dispose) &&
        Objects.equals(this.endianness, imageMetadata.endianness) &&
        Objects.equals(this.format, imageMetadata.format) &&
        Objects.equals(this.gamma, imageMetadata.gamma) &&
        Objects.equals(this.geometry, imageMetadata.geometry) &&
        Objects.equals(this.intensity, imageMetadata.intensity) &&
        Objects.equals(this.interlace, imageMetadata.interlace) &&
        Objects.equals(this.iterations, imageMetadata.iterations) &&
        Objects.equals(this.matteColor, imageMetadata.matteColor) &&
        Objects.equals(this.numberOfPixels, imageMetadata.numberOfPixels) &&
        Objects.equals(this.orientation, imageMetadata.orientation) &&
        Objects.equals(this.pageGeometry, imageMetadata.pageGeometry) &&
        Objects.equals(this.renderingIntent, imageMetadata.renderingIntent) &&
        Objects.equals(this.sizeInBytes, imageMetadata.sizeInBytes) &&
        Objects.equals(this.tainted, imageMetadata.tainted) &&
        Objects.equals(this.transparentColor, imageMetadata.transparentColor) &&
        Objects.equals(this.type, imageMetadata.type) &&
        Objects.equals(this.units, imageMetadata.units);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backgroundColor, borderColor, propertyClass, colorspace, compose, compression, depthInBits, dispose, endianness, format, gamma, geometry, intensity, interlace, iterations, matteColor, numberOfPixels, orientation, pageGeometry, renderingIntent, sizeInBytes, tainted, transparentColor, type, units);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageMetadata {\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    borderColor: ").append(toIndentedString(borderColor)).append("\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    colorspace: ").append(toIndentedString(colorspace)).append("\n");
    sb.append("    compose: ").append(toIndentedString(compose)).append("\n");
    sb.append("    compression: ").append(toIndentedString(compression)).append("\n");
    sb.append("    depthInBits: ").append(toIndentedString(depthInBits)).append("\n");
    sb.append("    dispose: ").append(toIndentedString(dispose)).append("\n");
    sb.append("    endianness: ").append(toIndentedString(endianness)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    gamma: ").append(toIndentedString(gamma)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
    sb.append("    intensity: ").append(toIndentedString(intensity)).append("\n");
    sb.append("    interlace: ").append(toIndentedString(interlace)).append("\n");
    sb.append("    iterations: ").append(toIndentedString(iterations)).append("\n");
    sb.append("    matteColor: ").append(toIndentedString(matteColor)).append("\n");
    sb.append("    numberOfPixels: ").append(toIndentedString(numberOfPixels)).append("\n");
    sb.append("    orientation: ").append(toIndentedString(orientation)).append("\n");
    sb.append("    pageGeometry: ").append(toIndentedString(pageGeometry)).append("\n");
    sb.append("    renderingIntent: ").append(toIndentedString(renderingIntent)).append("\n");
    sb.append("    sizeInBytes: ").append(toIndentedString(sizeInBytes)).append("\n");
    sb.append("    tainted: ").append(toIndentedString(tainted)).append("\n");
    sb.append("    transparentColor: ").append(toIndentedString(transparentColor)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
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

    // add `backgroundColor` to the URL query string
    if (getBackgroundColor() != null) {
      joiner.add(String.format("%sbackgroundColor%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getBackgroundColor()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `borderColor` to the URL query string
    if (getBorderColor() != null) {
      joiner.add(String.format("%sborderColor%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getBorderColor()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `class` to the URL query string
    if (getPropertyClass() != null) {
      joiner.add(String.format("%sclass%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getPropertyClass()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `colorspace` to the URL query string
    if (getColorspace() != null) {
      joiner.add(String.format("%scolorspace%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getColorspace()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `compose` to the URL query string
    if (getCompose() != null) {
      joiner.add(String.format("%scompose%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCompose()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `compression` to the URL query string
    if (getCompression() != null) {
      joiner.add(String.format("%scompression%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCompression()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `depthInBits` to the URL query string
    if (getDepthInBits() != null) {
      joiner.add(String.format("%sdepthInBits%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDepthInBits()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `dispose` to the URL query string
    if (getDispose() != null) {
      joiner.add(String.format("%sdispose%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDispose()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `endianness` to the URL query string
    if (getEndianness() != null) {
      joiner.add(String.format("%sendianness%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getEndianness()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `format` to the URL query string
    if (getFormat() != null) {
      joiner.add(String.format("%sformat%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getFormat()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `gamma` to the URL query string
    if (getGamma() != null) {
      joiner.add(String.format("%sgamma%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getGamma()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `geometry` to the URL query string
    if (getGeometry() != null) {
      joiner.add(String.format("%sgeometry%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getGeometry()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `intensity` to the URL query string
    if (getIntensity() != null) {
      joiner.add(String.format("%sintensity%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getIntensity()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `interlace` to the URL query string
    if (getInterlace() != null) {
      joiner.add(String.format("%sinterlace%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getInterlace()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `iterations` to the URL query string
    if (getIterations() != null) {
      joiner.add(String.format("%siterations%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getIterations()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `matteColor` to the URL query string
    if (getMatteColor() != null) {
      joiner.add(String.format("%smatteColor%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getMatteColor()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `numberOfPixels` to the URL query string
    if (getNumberOfPixels() != null) {
      joiner.add(String.format("%snumberOfPixels%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getNumberOfPixels()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `orientation` to the URL query string
    if (getOrientation() != null) {
      joiner.add(String.format("%sorientation%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getOrientation()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `pageGeometry` to the URL query string
    if (getPageGeometry() != null) {
      joiner.add(String.format("%spageGeometry%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getPageGeometry()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `renderingIntent` to the URL query string
    if (getRenderingIntent() != null) {
      joiner.add(String.format("%srenderingIntent%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getRenderingIntent()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `sizeInBytes` to the URL query string
    if (getSizeInBytes() != null) {
      joiner.add(String.format("%ssizeInBytes%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSizeInBytes()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `tainted` to the URL query string
    if (getTainted() != null) {
      joiner.add(String.format("%stainted%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getTainted()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `transparentColor` to the URL query string
    if (getTransparentColor() != null) {
      joiner.add(String.format("%stransparentColor%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getTransparentColor()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `units` to the URL query string
    if (getUnits() != null) {
      joiner.add(String.format("%sunits%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getUnits()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

