

# LipsyncDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**audioUrl** | **String** | A url to the audio file to be synchronized -- must be publicly accessible |  |
|**videoUrl** | **String** | A url to the video file to be synchronized -- must be publicly accessible |  |
|**synergize** | **Boolean** | A flag to enable / disable post-processing |  |
|**maxCredits** | **Double** | Maximum number of credits to use for video generation. If job exceeds this value, the job will be aborted |  [optional] |
|**webhookUrl** | **String** | A url to send a notification to upon completion of video generation |  [optional] |
|**model** | **String** | The model to use for video generation |  [optional] |



