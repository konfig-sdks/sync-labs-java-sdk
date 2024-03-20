

# AnimateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**videoUrl** | **String** | A url to the video file to be synchronized -- must be publicly accessible |  |
|**transcript** | **String** | A string of text to be spoken by the AI |  |
|**voiceId** | **String** | The voice to use for audio generation |  |
|**model** | **String** | The model to use for video generation |  [optional] |
|**maxCredits** | **Double** | Maximum number of credits to use for audio generation. If job exceeds this value, the job will be aborted |  [optional] |
|**webhookUrl** | **String** | A url to send a notification to upon completion of audio generation |  [optional] |



