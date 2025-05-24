package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.enums.ma_device_type;
import games.rednblack.miniaudio.internal.enums.ma_performance_profile;
import com.badlogic.gdx.jnigen.runtime.closure.ClosureObject;
import games.rednblack.miniaudio.internal.GdxMiniaudio;
import games.rednblack.miniaudio.internal.GdxMiniaudio_Internal;
import games.rednblack.miniaudio.internal.structs.ma_resampler_config;
import games.rednblack.miniaudio.internal.structs.ma_device_config.playback;
import games.rednblack.miniaudio.internal.structs.ma_device_config.capture;
import games.rednblack.miniaudio.internal.structs.ma_device_config.wasapi;
import games.rednblack.miniaudio.internal.structs.ma_device_config.alsa;
import games.rednblack.miniaudio.internal.structs.ma_device_config.pulse;
import games.rednblack.miniaudio.internal.structs.ma_device_config.coreaudio;
import games.rednblack.miniaudio.internal.structs.ma_device_config.opensl;
import games.rednblack.miniaudio.internal.structs.ma_device_config.aaudio;
import games.rednblack.miniaudio.internal.structs.ma_device_id;
import games.rednblack.miniaudio.internal.enums.ma_format;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.UBytePointer;
import games.rednblack.miniaudio.internal.enums.ma_channel_mix_mode;
import games.rednblack.miniaudio.internal.enums.ma_share_mode;
import games.rednblack.miniaudio.internal.enums.ma_wasapi_usage;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.BytePointer;
import games.rednblack.miniaudio.internal.enums.ma_opensl_stream_type;
import games.rednblack.miniaudio.internal.enums.ma_opensl_recording_preset;
import games.rednblack.miniaudio.internal.enums.ma_aaudio_usage;
import games.rednblack.miniaudio.internal.enums.ma_aaudio_content_type;
import games.rednblack.miniaudio.internal.enums.ma_aaudio_input_preset;
import games.rednblack.miniaudio.internal.enums.ma_aaudio_allowed_capture_policy;

public final class ma_device_config extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(114).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_device_config(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_device_config(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_device_config() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_device_config.ma_device_configPointer asPointer() {
        return new ma_device_config.ma_device_configPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_device_config.ma_device_configPointer ptr) {
        ptr.setPointer(this);
    }

    public ma_device_type deviceType() {
        return ma_device_type.getByIndex((int) getBufPtr().getUInt(0));
    }

    public void deviceType(ma_device_type deviceType) {
        getBufPtr().setUInt(0, deviceType.getIndex());
    }

    public long sampleRate() {
        return getBufPtr().getUInt(4);
    }

    public void sampleRate(long sampleRate) {
        getBufPtr().setUInt(4, sampleRate);
    }

    public long periodSizeInFrames() {
        return getBufPtr().getUInt(8);
    }

    public void periodSizeInFrames(long periodSizeInFrames) {
        getBufPtr().setUInt(8, periodSizeInFrames);
    }

    public long periodSizeInMilliseconds() {
        return getBufPtr().getUInt(12);
    }

    public void periodSizeInMilliseconds(long periodSizeInMilliseconds) {
        getBufPtr().setUInt(12, periodSizeInMilliseconds);
    }

    public long periods() {
        return getBufPtr().getUInt(16);
    }

    public void periods(long periods) {
        getBufPtr().setUInt(16, periods);
    }

    public ma_performance_profile performanceProfile() {
        return ma_performance_profile.getByIndex((int) getBufPtr().getUInt(20));
    }

    public void performanceProfile(ma_performance_profile performanceProfile) {
        getBufPtr().setUInt(20, performanceProfile.getIndex());
    }

    public char noPreSilencedOutputBuffer() {
        return getBufPtr().getUByte(24);
    }

    public void noPreSilencedOutputBuffer(char noPreSilencedOutputBuffer) {
        getBufPtr().setUByte(24, noPreSilencedOutputBuffer);
    }

    public char noClip() {
        return getBufPtr().getUByte(25);
    }

    public void noClip(char noClip) {
        getBufPtr().setUByte(25, noClip);
    }

    public char noDisableDenormals() {
        return getBufPtr().getUByte(26);
    }

    public void noDisableDenormals(char noDisableDenormals) {
        getBufPtr().setUByte(26, noDisableDenormals);
    }

    public char noFixedSizedCallback() {
        return getBufPtr().getUByte(27);
    }

    public void noFixedSizedCallback(char noFixedSizedCallback) {
        getBufPtr().setUByte(27, noFixedSizedCallback);
    }

    public ClosureObject<GdxMiniaudio.ma_device_data_proc> dataCallback() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 32 : 28), GdxMiniaudio_Internal.ma_device_data_proc_Internal::ma_device_data_proc_downcall);
    }

    public void dataCallback(ClosureObject<GdxMiniaudio.ma_device_data_proc> dataCallback) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 32 : 28, dataCallback.getPointer());
    }

    public ClosureObject<GdxMiniaudio.ma_device_notification_proc> notificationCallback() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 40 : 32), GdxMiniaudio_Internal.ma_device_notification_proc_Internal::ma_device_notification_proc_downcall);
    }

    public void notificationCallback(ClosureObject<GdxMiniaudio.ma_device_notification_proc> notificationCallback) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 40 : 32, notificationCallback.getPointer());
    }

    public ClosureObject<GdxMiniaudio.ma_stop_proc> stopCallback() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 48 : 36), GdxMiniaudio_Internal.ma_stop_proc_Internal::ma_stop_proc_downcall);
    }

    public void stopCallback(ClosureObject<GdxMiniaudio.ma_stop_proc> stopCallback) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 48 : 36, stopCallback.getPointer());
    }

    public VoidPointer pUserData() {
        return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 56 : 40), false);
    }

    public void pUserData(VoidPointer pUserData) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 56 : 40, pUserData.getPointer());
    }

    public ma_resampler_config resampling() {
        return new ma_resampler_config(getPointer() + (CHandler.IS_64_BIT ? 64 : 44), false);
    }

    public void resampling(ma_resampler_config toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 64 : 44), CHandler.IS_64_BIT ? 48 : 32, this);
    }

    public ma_resampler_config getResampling() {
        return new ma_resampler_config(getBufPtr().duplicate(CHandler.IS_64_BIT ? 64 : 44, CHandler.IS_64_BIT ? 48 : 32), true);
    }

    public void getResampling(ma_resampler_config toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 64 : 44, CHandler.IS_64_BIT ? 48 : 32);
    }

    public void setResampling(ma_resampler_config toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_64_BIT ? 64 : 44, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 48 : 32);
    }

    public playback playback() {
        return new playback(getPointer() + (CHandler.IS_64_BIT ? 112 : 76), false);
    }

    public void playback(playback toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 112 : 76), CHandler.IS_64_BIT ? 40 : 28, this);
    }

    public playback getPlayback() {
        return new playback(getBufPtr().duplicate(CHandler.IS_64_BIT ? 112 : 76, CHandler.IS_64_BIT ? 40 : 28), true);
    }

    public void getPlayback(playback toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 112 : 76, CHandler.IS_64_BIT ? 40 : 28);
    }

    public void setPlayback(playback toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_64_BIT ? 112 : 76, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 40 : 28);
    }

    public capture capture() {
        return new capture(getPointer() + (CHandler.IS_64_BIT ? 152 : 104), false);
    }

    public void capture(capture toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 152 : 104), CHandler.IS_64_BIT ? 40 : 28, this);
    }

    public capture getCapture() {
        return new capture(getBufPtr().duplicate(CHandler.IS_64_BIT ? 152 : 104, CHandler.IS_64_BIT ? 40 : 28), true);
    }

    public void getCapture(capture toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 152 : 104, CHandler.IS_64_BIT ? 40 : 28);
    }

    public void setCapture(capture toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_64_BIT ? 152 : 104, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 40 : 28);
    }

    public wasapi wasapi() {
        return new wasapi(getPointer() + (CHandler.IS_64_BIT ? 192 : 132), false);
    }

    public void wasapi(wasapi toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 192 : 132), 16, this);
    }

    public wasapi getWasapi() {
        return new wasapi(getBufPtr().duplicate(CHandler.IS_64_BIT ? 192 : 132, 16), true);
    }

    public void getWasapi(wasapi toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 192 : 132, 16);
    }

    public void setWasapi(wasapi toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_64_BIT ? 192 : 132, toCopyFrom.getBufPtr(), 0, 16);
    }

    public alsa alsa() {
        return new alsa(getPointer() + (CHandler.IS_64_BIT ? 208 : 148), false);
    }

    public void alsa(alsa toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 208 : 148), 16, this);
    }

    public alsa getAlsa() {
        return new alsa(getBufPtr().duplicate(CHandler.IS_64_BIT ? 208 : 148, 16), true);
    }

    public void getAlsa(alsa toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 208 : 148, 16);
    }

    public void setAlsa(alsa toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_64_BIT ? 208 : 148, toCopyFrom.getBufPtr(), 0, 16);
    }

    public pulse pulse() {
        return new pulse(getPointer() + (CHandler.IS_64_BIT ? 224 : 164), false);
    }

    public void pulse(pulse toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 224 : 164), CHandler.IS_64_BIT ? 24 : 12, this);
    }

    public pulse getPulse() {
        return new pulse(getBufPtr().duplicate(CHandler.IS_64_BIT ? 224 : 164, CHandler.IS_64_BIT ? 24 : 12), true);
    }

    public void getPulse(pulse toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 224 : 164, CHandler.IS_64_BIT ? 24 : 12);
    }

    public void setPulse(pulse toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_64_BIT ? 224 : 164, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 24 : 12);
    }

    public coreaudio coreaudio() {
        return new coreaudio(getPointer() + (CHandler.IS_64_BIT ? 248 : 176), false);
    }

    public void coreaudio(coreaudio toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 248 : 176), 4, this);
    }

    public coreaudio getCoreaudio() {
        return new coreaudio(getBufPtr().duplicate(CHandler.IS_64_BIT ? 248 : 176, 4), true);
    }

    public void getCoreaudio(coreaudio toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 248 : 176, 4);
    }

    public void setCoreaudio(coreaudio toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_64_BIT ? 248 : 176, toCopyFrom.getBufPtr(), 0, 4);
    }

    public opensl opensl() {
        return new opensl(getPointer() + (CHandler.IS_64_BIT ? 252 : 180), false);
    }

    public void opensl(opensl toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 252 : 180), 12, this);
    }

    public opensl getOpensl() {
        return new opensl(getBufPtr().duplicate(CHandler.IS_64_BIT ? 252 : 180, 12), true);
    }

    public void getOpensl(opensl toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 252 : 180, 12);
    }

    public void setOpensl(opensl toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_64_BIT ? 252 : 180, toCopyFrom.getBufPtr(), 0, 12);
    }

    public aaudio aaudio() {
        return new aaudio(getPointer() + (CHandler.IS_64_BIT ? 264 : 192), false);
    }

    public void aaudio(aaudio toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 264 : 192), 28, this);
    }

    public aaudio getAaudio() {
        return new aaudio(getBufPtr().duplicate(CHandler.IS_64_BIT ? 264 : 192, 28), true);
    }

    public void getAaudio(aaudio toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 264 : 192, 28);
    }

    public void setAaudio(aaudio toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_64_BIT ? 264 : 192, toCopyFrom.getBufPtr(), 0, 28);
    }

    public static final class ma_device_configPointer extends StackElementPointer<ma_device_config> {

        public ma_device_configPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_device_configPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_device_configPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_device_configPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_device_configPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_device_configPointer() {
            this(1, true);
        }

        public ma_device_configPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_device_config createStackElement(long ptr, boolean freeOnGC) {
            return new ma_device_config(ptr, freeOnGC);
        }
    }

    public final static class playback extends Struct {

        private final static int __size;

        private final static long __ffi_type;

        static {
            __ffi_type = FFITypes.getCTypeInfo(233).getFfiType();
            __size = CHandler.getSizeFromFFIType(__ffi_type);
        }

        public playback(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public playback(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public playback() {
            super(__size);
        }

        public long getSize() {
            return __size;
        }

        public long getFFIType() {
            return __ffi_type;
        }

        public playback.playbackPointer asPointer() {
            return new playback.playbackPointer(getPointer(), false, 1, this);
        }

        public void asPointer(playback.playbackPointer ptr) {
            ptr.setPointer(this);
        }

        public ma_device_id.ma_device_idPointer pDeviceID() {
            return new ma_device_id.ma_device_idPointer(getBufPtr().getNativePointer(0), false);
        }

        public void pDeviceID(ma_device_id.ma_device_idPointer pDeviceID) {
            getBufPtr().setNativePointer(0, pDeviceID.getPointer());
        }

        public ma_format format() {
            return ma_format.getByIndex((int) getBufPtr().getUInt(CHandler.IS_64_BIT ? 8 : 4));
        }

        public void format(ma_format format) {
            getBufPtr().setUInt(CHandler.IS_64_BIT ? 8 : 4, format.getIndex());
        }

        public long channels() {
            return getBufPtr().getUInt(CHandler.IS_64_BIT ? 12 : 8);
        }

        public void channels(long channels) {
            getBufPtr().setUInt(CHandler.IS_64_BIT ? 12 : 8, channels);
        }

        public UBytePointer pChannelMap() {
            return new UBytePointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 16 : 12), false);
        }

        public void pChannelMap(UBytePointer pChannelMap) {
            getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 16 : 12, pChannelMap.getPointer());
        }

        public ma_channel_mix_mode channelMixMode() {
            return ma_channel_mix_mode.getByIndex((int) getBufPtr().getUInt(CHandler.IS_64_BIT ? 24 : 16));
        }

        public void channelMixMode(ma_channel_mix_mode channelMixMode) {
            getBufPtr().setUInt(CHandler.IS_64_BIT ? 24 : 16, channelMixMode.getIndex());
        }

        public long calculateLFEFromSpatialChannels() {
            return getBufPtr().getUInt(CHandler.IS_64_BIT ? 28 : 20);
        }

        public void calculateLFEFromSpatialChannels(long calculateLFEFromSpatialChannels) {
            getBufPtr().setUInt(CHandler.IS_64_BIT ? 28 : 20, calculateLFEFromSpatialChannels);
        }

        public ma_share_mode shareMode() {
            return ma_share_mode.getByIndex((int) getBufPtr().getUInt(CHandler.IS_64_BIT ? 32 : 24));
        }

        public void shareMode(ma_share_mode shareMode) {
            getBufPtr().setUInt(CHandler.IS_64_BIT ? 32 : 24, shareMode.getIndex());
        }

        public static final class playbackPointer extends StackElementPointer<playback> {

            public playbackPointer(VoidPointer pointer) {
                super(pointer);
            }

            public playbackPointer(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public playbackPointer(long pointer, boolean freeOnGC, int capacity) {
                super(pointer, freeOnGC, capacity * __size);
            }

            public playbackPointer(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public playbackPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                super(pointer, freeOnGC, capacity * __size);
                setParent(parent);
            }

            public playbackPointer() {
                this(1, true);
            }

            public playbackPointer(int count, boolean freeOnGC) {
                super(__size, count, freeOnGC);
            }

            public int getSize() {
                return __size;
            }

            protected playback createStackElement(long ptr, boolean freeOnGC) {
                return new playback(ptr, freeOnGC);
            }
        }
    }

    public final static class capture extends Struct {

        private final static int __size;

        private final static long __ffi_type;

        static {
            __ffi_type = FFITypes.getCTypeInfo(41).getFfiType();
            __size = CHandler.getSizeFromFFIType(__ffi_type);
        }

        public capture(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public capture(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public capture() {
            super(__size);
        }

        public long getSize() {
            return __size;
        }

        public long getFFIType() {
            return __ffi_type;
        }

        public capture.capturePointer asPointer() {
            return new capture.capturePointer(getPointer(), false, 1, this);
        }

        public void asPointer(capture.capturePointer ptr) {
            ptr.setPointer(this);
        }

        public ma_device_id.ma_device_idPointer pDeviceID() {
            return new ma_device_id.ma_device_idPointer(getBufPtr().getNativePointer(0), false);
        }

        public void pDeviceID(ma_device_id.ma_device_idPointer pDeviceID) {
            getBufPtr().setNativePointer(0, pDeviceID.getPointer());
        }

        public ma_format format() {
            return ma_format.getByIndex((int) getBufPtr().getUInt(CHandler.IS_64_BIT ? 8 : 4));
        }

        public void format(ma_format format) {
            getBufPtr().setUInt(CHandler.IS_64_BIT ? 8 : 4, format.getIndex());
        }

        public long channels() {
            return getBufPtr().getUInt(CHandler.IS_64_BIT ? 12 : 8);
        }

        public void channels(long channels) {
            getBufPtr().setUInt(CHandler.IS_64_BIT ? 12 : 8, channels);
        }

        public UBytePointer pChannelMap() {
            return new UBytePointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 16 : 12), false);
        }

        public void pChannelMap(UBytePointer pChannelMap) {
            getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 16 : 12, pChannelMap.getPointer());
        }

        public ma_channel_mix_mode channelMixMode() {
            return ma_channel_mix_mode.getByIndex((int) getBufPtr().getUInt(CHandler.IS_64_BIT ? 24 : 16));
        }

        public void channelMixMode(ma_channel_mix_mode channelMixMode) {
            getBufPtr().setUInt(CHandler.IS_64_BIT ? 24 : 16, channelMixMode.getIndex());
        }

        public long calculateLFEFromSpatialChannels() {
            return getBufPtr().getUInt(CHandler.IS_64_BIT ? 28 : 20);
        }

        public void calculateLFEFromSpatialChannels(long calculateLFEFromSpatialChannels) {
            getBufPtr().setUInt(CHandler.IS_64_BIT ? 28 : 20, calculateLFEFromSpatialChannels);
        }

        public ma_share_mode shareMode() {
            return ma_share_mode.getByIndex((int) getBufPtr().getUInt(CHandler.IS_64_BIT ? 32 : 24));
        }

        public void shareMode(ma_share_mode shareMode) {
            getBufPtr().setUInt(CHandler.IS_64_BIT ? 32 : 24, shareMode.getIndex());
        }

        public static final class capturePointer extends StackElementPointer<capture> {

            public capturePointer(VoidPointer pointer) {
                super(pointer);
            }

            public capturePointer(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public capturePointer(long pointer, boolean freeOnGC, int capacity) {
                super(pointer, freeOnGC, capacity * __size);
            }

            public capturePointer(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public capturePointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                super(pointer, freeOnGC, capacity * __size);
                setParent(parent);
            }

            public capturePointer() {
                this(1, true);
            }

            public capturePointer(int count, boolean freeOnGC) {
                super(__size, count, freeOnGC);
            }

            public int getSize() {
                return __size;
            }

            protected capture createStackElement(long ptr, boolean freeOnGC) {
                return new capture(ptr, freeOnGC);
            }
        }
    }

    public final static class wasapi extends Struct {

        private final static int __size;

        private final static long __ffi_type;

        static {
            __ffi_type = FFITypes.getCTypeInfo(249).getFfiType();
            __size = CHandler.getSizeFromFFIType(__ffi_type);
        }

        public wasapi(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public wasapi(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public wasapi() {
            super(__size);
        }

        public long getSize() {
            return __size;
        }

        public long getFFIType() {
            return __ffi_type;
        }

        public wasapi.wasapiPointer asPointer() {
            return new wasapi.wasapiPointer(getPointer(), false, 1, this);
        }

        public void asPointer(wasapi.wasapiPointer ptr) {
            ptr.setPointer(this);
        }

        public ma_wasapi_usage usage() {
            return ma_wasapi_usage.getByIndex((int) getBufPtr().getUInt(0));
        }

        public void usage(ma_wasapi_usage usage) {
            getBufPtr().setUInt(0, usage.getIndex());
        }

        public char noAutoConvertSRC() {
            return getBufPtr().getUByte(4);
        }

        public void noAutoConvertSRC(char noAutoConvertSRC) {
            getBufPtr().setUByte(4, noAutoConvertSRC);
        }

        public char noDefaultQualitySRC() {
            return getBufPtr().getUByte(5);
        }

        public void noDefaultQualitySRC(char noDefaultQualitySRC) {
            getBufPtr().setUByte(5, noDefaultQualitySRC);
        }

        public char noAutoStreamRouting() {
            return getBufPtr().getUByte(6);
        }

        public void noAutoStreamRouting(char noAutoStreamRouting) {
            getBufPtr().setUByte(6, noAutoStreamRouting);
        }

        public char noHardwareOffloading() {
            return getBufPtr().getUByte(7);
        }

        public void noHardwareOffloading(char noHardwareOffloading) {
            getBufPtr().setUByte(7, noHardwareOffloading);
        }

        public long loopbackProcessID() {
            return getBufPtr().getUInt(8);
        }

        public void loopbackProcessID(long loopbackProcessID) {
            getBufPtr().setUInt(8, loopbackProcessID);
        }

        public char loopbackProcessExclude() {
            return getBufPtr().getUByte(12);
        }

        public void loopbackProcessExclude(char loopbackProcessExclude) {
            getBufPtr().setUByte(12, loopbackProcessExclude);
        }

        public static final class wasapiPointer extends StackElementPointer<wasapi> {

            public wasapiPointer(VoidPointer pointer) {
                super(pointer);
            }

            public wasapiPointer(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public wasapiPointer(long pointer, boolean freeOnGC, int capacity) {
                super(pointer, freeOnGC, capacity * __size);
            }

            public wasapiPointer(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public wasapiPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                super(pointer, freeOnGC, capacity * __size);
                setParent(parent);
            }

            public wasapiPointer() {
                this(1, true);
            }

            public wasapiPointer(int count, boolean freeOnGC) {
                super(__size, count, freeOnGC);
            }

            public int getSize() {
                return __size;
            }

            protected wasapi createStackElement(long ptr, boolean freeOnGC) {
                return new wasapi(ptr, freeOnGC);
            }
        }
    }

    public final static class alsa extends Struct {

        private final static int __size;

        private final static long __ffi_type;

        static {
            __ffi_type = FFITypes.getCTypeInfo(35).getFfiType();
            __size = CHandler.getSizeFromFFIType(__ffi_type);
        }

        public alsa(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public alsa(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public alsa() {
            super(__size);
        }

        public long getSize() {
            return __size;
        }

        public long getFFIType() {
            return __ffi_type;
        }

        public alsa.alsaPointer asPointer() {
            return new alsa.alsaPointer(getPointer(), false, 1, this);
        }

        public void asPointer(alsa.alsaPointer ptr) {
            ptr.setPointer(this);
        }

        public long noMMap() {
            return getBufPtr().getUInt(0);
        }

        public void noMMap(long noMMap) {
            getBufPtr().setUInt(0, noMMap);
        }

        public long noAutoFormat() {
            return getBufPtr().getUInt(4);
        }

        public void noAutoFormat(long noAutoFormat) {
            getBufPtr().setUInt(4, noAutoFormat);
        }

        public long noAutoChannels() {
            return getBufPtr().getUInt(8);
        }

        public void noAutoChannels(long noAutoChannels) {
            getBufPtr().setUInt(8, noAutoChannels);
        }

        public long noAutoResample() {
            return getBufPtr().getUInt(12);
        }

        public void noAutoResample(long noAutoResample) {
            getBufPtr().setUInt(12, noAutoResample);
        }

        public static final class alsaPointer extends StackElementPointer<alsa> {

            public alsaPointer(VoidPointer pointer) {
                super(pointer);
            }

            public alsaPointer(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public alsaPointer(long pointer, boolean freeOnGC, int capacity) {
                super(pointer, freeOnGC, capacity * __size);
            }

            public alsaPointer(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public alsaPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                super(pointer, freeOnGC, capacity * __size);
                setParent(parent);
            }

            public alsaPointer() {
                this(1, true);
            }

            public alsaPointer(int count, boolean freeOnGC) {
                super(__size, count, freeOnGC);
            }

            public int getSize() {
                return __size;
            }

            protected alsa createStackElement(long ptr, boolean freeOnGC) {
                return new alsa(ptr, freeOnGC);
            }
        }
    }

    public final static class pulse extends Struct {

        private final static int __size;

        private final static long __ffi_type;

        static {
            __ffi_type = FFITypes.getCTypeInfo(236).getFfiType();
            __size = CHandler.getSizeFromFFIType(__ffi_type);
        }

        public pulse(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public pulse(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public pulse() {
            super(__size);
        }

        public long getSize() {
            return __size;
        }

        public long getFFIType() {
            return __ffi_type;
        }

        public pulse.pulsePointer asPointer() {
            return new pulse.pulsePointer(getPointer(), false, 1, this);
        }

        public void asPointer(pulse.pulsePointer ptr) {
            ptr.setPointer(this);
        }

        public BytePointer pStreamNamePlayback() {
            return new BytePointer(getBufPtr().getNativePointer(0), false);
        }

        public void pStreamNamePlayback(BytePointer pStreamNamePlayback) {
            getBufPtr().setNativePointer(0, pStreamNamePlayback.getPointer());
        }

        public BytePointer pStreamNameCapture() {
            return new BytePointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false);
        }

        public void pStreamNameCapture(BytePointer pStreamNameCapture) {
            getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pStreamNameCapture.getPointer());
        }

        public int channelMap() {
            return getBufPtr().getInt(CHandler.IS_64_BIT ? 16 : 8);
        }

        public void channelMap(int channelMap) {
            getBufPtr().setInt(CHandler.IS_64_BIT ? 16 : 8, channelMap);
        }

        public static final class pulsePointer extends StackElementPointer<pulse> {

            public pulsePointer(VoidPointer pointer) {
                super(pointer);
            }

            public pulsePointer(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public pulsePointer(long pointer, boolean freeOnGC, int capacity) {
                super(pointer, freeOnGC, capacity * __size);
            }

            public pulsePointer(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public pulsePointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                super(pointer, freeOnGC, capacity * __size);
                setParent(parent);
            }

            public pulsePointer() {
                this(1, true);
            }

            public pulsePointer(int count, boolean freeOnGC) {
                super(__size, count, freeOnGC);
            }

            public int getSize() {
                return __size;
            }

            protected pulse createStackElement(long ptr, boolean freeOnGC) {
                return new pulse(ptr, freeOnGC);
            }
        }
    }

    public final static class coreaudio extends Struct {

        private final static int __size;

        private final static long __ffi_type;

        static {
            __ffi_type = FFITypes.getCTypeInfo(46).getFfiType();
            __size = CHandler.getSizeFromFFIType(__ffi_type);
        }

        public coreaudio(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public coreaudio(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public coreaudio() {
            super(__size);
        }

        public long getSize() {
            return __size;
        }

        public long getFFIType() {
            return __ffi_type;
        }

        public coreaudio.coreaudioPointer asPointer() {
            return new coreaudio.coreaudioPointer(getPointer(), false, 1, this);
        }

        public void asPointer(coreaudio.coreaudioPointer ptr) {
            ptr.setPointer(this);
        }

        public long allowNominalSampleRateChange() {
            return getBufPtr().getUInt(0);
        }

        public void allowNominalSampleRateChange(long allowNominalSampleRateChange) {
            getBufPtr().setUInt(0, allowNominalSampleRateChange);
        }

        public static final class coreaudioPointer extends StackElementPointer<coreaudio> {

            public coreaudioPointer(VoidPointer pointer) {
                super(pointer);
            }

            public coreaudioPointer(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public coreaudioPointer(long pointer, boolean freeOnGC, int capacity) {
                super(pointer, freeOnGC, capacity * __size);
            }

            public coreaudioPointer(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public coreaudioPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                super(pointer, freeOnGC, capacity * __size);
                setParent(parent);
            }

            public coreaudioPointer() {
                this(1, true);
            }

            public coreaudioPointer(int count, boolean freeOnGC) {
                super(__size, count, freeOnGC);
            }

            public int getSize() {
                return __size;
            }

            protected coreaudio createStackElement(long ptr, boolean freeOnGC) {
                return new coreaudio(ptr, freeOnGC);
            }
        }
    }

    public final static class opensl extends Struct {

        private final static int __size;

        private final static long __ffi_type;

        static {
            __ffi_type = FFITypes.getCTypeInfo(228).getFfiType();
            __size = CHandler.getSizeFromFFIType(__ffi_type);
        }

        public opensl(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public opensl(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public opensl() {
            super(__size);
        }

        public long getSize() {
            return __size;
        }

        public long getFFIType() {
            return __ffi_type;
        }

        public opensl.openslPointer asPointer() {
            return new opensl.openslPointer(getPointer(), false, 1, this);
        }

        public void asPointer(opensl.openslPointer ptr) {
            ptr.setPointer(this);
        }

        public ma_opensl_stream_type streamType() {
            return ma_opensl_stream_type.getByIndex((int) getBufPtr().getUInt(0));
        }

        public void streamType(ma_opensl_stream_type streamType) {
            getBufPtr().setUInt(0, streamType.getIndex());
        }

        public ma_opensl_recording_preset recordingPreset() {
            return ma_opensl_recording_preset.getByIndex((int) getBufPtr().getUInt(4));
        }

        public void recordingPreset(ma_opensl_recording_preset recordingPreset) {
            getBufPtr().setUInt(4, recordingPreset.getIndex());
        }

        public long enableCompatibilityWorkarounds() {
            return getBufPtr().getUInt(8);
        }

        public void enableCompatibilityWorkarounds(long enableCompatibilityWorkarounds) {
            getBufPtr().setUInt(8, enableCompatibilityWorkarounds);
        }

        public static final class openslPointer extends StackElementPointer<opensl> {

            public openslPointer(VoidPointer pointer) {
                super(pointer);
            }

            public openslPointer(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public openslPointer(long pointer, boolean freeOnGC, int capacity) {
                super(pointer, freeOnGC, capacity * __size);
            }

            public openslPointer(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public openslPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                super(pointer, freeOnGC, capacity * __size);
                setParent(parent);
            }

            public openslPointer() {
                this(1, true);
            }

            public openslPointer(int count, boolean freeOnGC) {
                super(__size, count, freeOnGC);
            }

            public int getSize() {
                return __size;
            }

            protected opensl createStackElement(long ptr, boolean freeOnGC) {
                return new opensl(ptr, freeOnGC);
            }
        }
    }

    public final static class aaudio extends Struct {

        private final static int __size;

        private final static long __ffi_type;

        static {
            __ffi_type = FFITypes.getCTypeInfo(33).getFfiType();
            __size = CHandler.getSizeFromFFIType(__ffi_type);
        }

        public aaudio(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public aaudio(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public aaudio() {
            super(__size);
        }

        public long getSize() {
            return __size;
        }

        public long getFFIType() {
            return __ffi_type;
        }

        public aaudio.aaudioPointer asPointer() {
            return new aaudio.aaudioPointer(getPointer(), false, 1, this);
        }

        public void asPointer(aaudio.aaudioPointer ptr) {
            ptr.setPointer(this);
        }

        public ma_aaudio_usage usage() {
            return ma_aaudio_usage.getByIndex((int) getBufPtr().getUInt(0));
        }

        public void usage(ma_aaudio_usage usage) {
            getBufPtr().setUInt(0, usage.getIndex());
        }

        public ma_aaudio_content_type contentType() {
            return ma_aaudio_content_type.getByIndex((int) getBufPtr().getUInt(4));
        }

        public void contentType(ma_aaudio_content_type contentType) {
            getBufPtr().setUInt(4, contentType.getIndex());
        }

        public ma_aaudio_input_preset inputPreset() {
            return ma_aaudio_input_preset.getByIndex((int) getBufPtr().getUInt(8));
        }

        public void inputPreset(ma_aaudio_input_preset inputPreset) {
            getBufPtr().setUInt(8, inputPreset.getIndex());
        }

        public ma_aaudio_allowed_capture_policy allowedCapturePolicy() {
            return ma_aaudio_allowed_capture_policy.getByIndex((int) getBufPtr().getUInt(12));
        }

        public void allowedCapturePolicy(ma_aaudio_allowed_capture_policy allowedCapturePolicy) {
            getBufPtr().setUInt(12, allowedCapturePolicy.getIndex());
        }

        public long noAutoStartAfterReroute() {
            return getBufPtr().getUInt(16);
        }

        public void noAutoStartAfterReroute(long noAutoStartAfterReroute) {
            getBufPtr().setUInt(16, noAutoStartAfterReroute);
        }

        public long enableCompatibilityWorkarounds() {
            return getBufPtr().getUInt(20);
        }

        public void enableCompatibilityWorkarounds(long enableCompatibilityWorkarounds) {
            getBufPtr().setUInt(20, enableCompatibilityWorkarounds);
        }

        public long allowSetBufferCapacity() {
            return getBufPtr().getUInt(24);
        }

        public void allowSetBufferCapacity(long allowSetBufferCapacity) {
            getBufPtr().setUInt(24, allowSetBufferCapacity);
        }

        public static final class aaudioPointer extends StackElementPointer<aaudio> {

            public aaudioPointer(VoidPointer pointer) {
                super(pointer);
            }

            public aaudioPointer(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public aaudioPointer(long pointer, boolean freeOnGC, int capacity) {
                super(pointer, freeOnGC, capacity * __size);
            }

            public aaudioPointer(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public aaudioPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                super(pointer, freeOnGC, capacity * __size);
                setParent(parent);
            }

            public aaudioPointer() {
                this(1, true);
            }

            public aaudioPointer(int count, boolean freeOnGC) {
                super(__size, count, freeOnGC);
            }

            public int getSize() {
                return __size;
            }

            protected aaudio createStackElement(long ptr, boolean freeOnGC) {
                return new aaudio(ptr, freeOnGC);
            }
        }
    }
}
