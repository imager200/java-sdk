

# ConcatRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**concatMode** | [**ConcatModeEnum**](#ConcatModeEnum) | Defines whether the result image will be resized to the smaller one or the larger one in case both images have different dimensions. It has not effect if images have the same dimensions. |  [optional] |
|**direction** | [**DirectionEnum**](#DirectionEnum) | This parameter defines how the images will be concatenated. horizontal means that the images will concatenated one beside the other from left to right. vertical means that images will be concatenated one on the top of the other |  [optional] |
|**image1** | **String** |  |  [optional] |
|**image2** | **String** |  |  [optional] |
|**targetFormat** | [**TargetFormatEnum**](#TargetFormatEnum) |  |  [optional] |



## Enum: ConcatModeEnum

| Name | Value |
|---- | -----|
| NONE | &quot;none&quot; |
| RTS | &quot;rts&quot; |
| RTL | &quot;rtl&quot; |



## Enum: DirectionEnum

| Name | Value |
|---- | -----|
| HOR | &quot;hor&quot; |
| VER | &quot;ver&quot; |



## Enum: TargetFormatEnum

| Name | Value |
|---- | -----|
| JPEG | &quot;jpeg&quot; |
| PNG | &quot;png&quot; |
| BMP | &quot;bmp&quot; |
| GIF | &quot;gif&quot; |



