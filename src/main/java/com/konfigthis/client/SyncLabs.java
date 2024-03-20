package com.konfigthis.client;

import com.konfigthis.client.api.AnimateApi;
import com.konfigthis.client.api.LipsyncApi;
import com.konfigthis.client.api.SpeakApi;
import com.konfigthis.client.api.TranslateApi;
import com.konfigthis.client.api.VideoApi;
import com.konfigthis.client.api.VoicesApi;

public class SyncLabs {
    private ApiClient apiClient;
    public final AnimateApi animate;
    public final LipsyncApi lipsync;
    public final SpeakApi speak;
    public final TranslateApi translate;
    public final VideoApi video;
    public final VoicesApi voices;

    public SyncLabs() {
        this(null);
    }

    public SyncLabs(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.animate = new AnimateApi(this.apiClient);
        this.lipsync = new LipsyncApi(this.apiClient);
        this.speak = new SpeakApi(this.apiClient);
        this.translate = new TranslateApi(this.apiClient);
        this.video = new VideoApi(this.apiClient);
        this.voices = new VoicesApi(this.apiClient);
    }

}
