package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.enums.ma_resample_algorithm;
import games.rednblack.miniaudio.internal.structs.ma_resampling_backend_vtable;
import games.rednblack.miniaudio.internal.structs.ma_device.resampling.linear;
import games.rednblack.miniaudio.internal.structs.ma_device_id;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.BytePointer;
import games.rednblack.miniaudio.internal.enums.ma_share_mode;
import games.rednblack.miniaudio.internal.enums.ma_format;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.UBytePointer;
import games.rednblack.miniaudio.internal.enums.ma_channel_mix_mode;
import games.rednblack.miniaudio.internal.structs.ma_data_converter;

public final class ma_device extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(113).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_device(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_device(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_device() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_device.ma_devicePointer asPointer() {
        return new ma_device.ma_devicePointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_device.ma_devicePointer ptr) {
        ptr.setPointer(this);
    }

    public static final class ma_devicePointer extends StackElementPointer<ma_device> {

        public ma_devicePointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_devicePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_devicePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_devicePointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_devicePointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_devicePointer() {
            this(1, true);
        }

        public ma_devicePointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_device createStackElement(long ptr, boolean freeOnGC) {
            return new ma_device(ptr, freeOnGC);
        }
    }

    public final static class resampling extends Struct {

        private final static int __size;

        private final static long __ffi_type;

        static {
            __ffi_type = FFITypes.getCTypeInfo(239).getFfiType();
            __size = CHandler.getSizeFromFFIType(__ffi_type);
        }

        public resampling(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public resampling(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public resampling() {
            super(__size);
        }

        public long getSize() {
            return __size;
        }

        public long getFFIType() {
            return __ffi_type;
        }

        public resampling.resamplingPointer asPointer() {
            return new resampling.resamplingPointer(getPointer(), false, 1, this);
        }

        public void asPointer(resampling.resamplingPointer ptr) {
            ptr.setPointer(this);
        }

        public ma_resample_algorithm algorithm() {
            return ma_resample_algorithm.getByIndex((int) getBufPtr().getUInt(0));
        }

        public void algorithm(ma_resample_algorithm algorithm) {
            getBufPtr().setUInt(0, algorithm.getIndex());
        }

        public ma_resampling_backend_vtable.ma_resampling_backend_vtablePointer pBackendVTable() {
            return new ma_resampling_backend_vtable.ma_resampling_backend_vtablePointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false);
        }

        public void pBackendVTable(ma_resampling_backend_vtable.ma_resampling_backend_vtablePointer pBackendVTable) {
            getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pBackendVTable.getPointer());
        }

        public VoidPointer pBackendUserData() {
            return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 16 : 8), false);
        }

        public void pBackendUserData(VoidPointer pBackendUserData) {
            getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 16 : 8, pBackendUserData.getPointer());
        }

        public linear linear() {
            return new linear(getPointer() + (CHandler.IS_64_BIT ? 24 : 12), false);
        }

        public void linear(linear toSetPtr) {
            toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 24 : 12), 4, this);
        }

        public linear getLinear() {
            return new linear(getBufPtr().duplicate(CHandler.IS_64_BIT ? 24 : 12, 4), true);
        }

        public void getLinear(linear toCopyTo) {
            toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 24 : 12, 4);
        }

        public void setLinear(linear toCopyFrom) {
            getBufPtr().copyFrom(CHandler.IS_64_BIT ? 24 : 12, toCopyFrom.getBufPtr(), 0, 4);
        }

        public static final class resamplingPointer extends StackElementPointer<resampling> {

            public resamplingPointer(VoidPointer pointer) {
                super(pointer);
            }

            public resamplingPointer(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public resamplingPointer(long pointer, boolean freeOnGC, int capacity) {
                super(pointer, freeOnGC, capacity * __size);
            }

            public resamplingPointer(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public resamplingPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                super(pointer, freeOnGC, capacity * __size);
                setParent(parent);
            }

            public resamplingPointer() {
                this(1, true);
            }

            public resamplingPointer(int count, boolean freeOnGC) {
                super(__size, count, freeOnGC);
            }

            public int getSize() {
                return __size;
            }

            protected resampling createStackElement(long ptr, boolean freeOnGC) {
                return new resampling(ptr, freeOnGC);
            }
        }

        public final static class linear extends Struct {

            private final static int __size;

            private final static long __ffi_type;

            static {
                __ffi_type = FFITypes.getCTypeInfo(65).getFfiType();
                __size = CHandler.getSizeFromFFIType(__ffi_type);
            }

            public linear(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public linear(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public linear() {
                super(__size);
            }

            public long getSize() {
                return __size;
            }

            public long getFFIType() {
                return __ffi_type;
            }

            public linear.linearPointer asPointer() {
                return new linear.linearPointer(getPointer(), false, 1, this);
            }

            public void asPointer(linear.linearPointer ptr) {
                ptr.setPointer(this);
            }

            public long lpfOrder() {
                return getBufPtr().getUInt(0);
            }

            public void lpfOrder(long lpfOrder) {
                getBufPtr().setUInt(0, lpfOrder);
            }

            public static final class linearPointer extends StackElementPointer<linear> {

                public linearPointer(VoidPointer pointer) {
                    super(pointer);
                }

                public linearPointer(long pointer, boolean freeOnGC) {
                    super(pointer, freeOnGC);
                }

                public linearPointer(long pointer, boolean freeOnGC, int capacity) {
                    super(pointer, freeOnGC, capacity * __size);
                }

                public linearPointer(long pointer, boolean freeOnGC, Pointing parent) {
                    super(pointer, freeOnGC);
                    setParent(parent);
                }

                public linearPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                    super(pointer, freeOnGC, capacity * __size);
                    setParent(parent);
                }

                public linearPointer() {
                    this(1, true);
                }

                public linearPointer(int count, boolean freeOnGC) {
                    super(__size, count, freeOnGC);
                }

                public int getSize() {
                    return __size;
                }

                protected linear createStackElement(long ptr, boolean freeOnGC) {
                    return new linear(ptr, freeOnGC);
                }
            }
        }
    }

    public final static class playback extends Struct {

        private final static int __size;

        private final static long __ffi_type;

        static {
            __ffi_type = FFITypes.getCTypeInfo(232).getFfiType();
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

        public ma_device_id.ma_device_idPointer pID() {
            return new ma_device_id.ma_device_idPointer(getBufPtr().getNativePointer(0), false);
        }

        public void pID(ma_device_id.ma_device_idPointer pID) {
            getBufPtr().setNativePointer(0, pID.getPointer());
        }

        public ma_device_id id() {
            return new ma_device_id(getPointer() + (CHandler.IS_64_BIT ? 8 : 4), false);
        }

        public void id(ma_device_id toSetPtr) {
            toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 8 : 4), 256, this);
        }

        public ma_device_id getId() {
            return new ma_device_id(getBufPtr().duplicate(CHandler.IS_64_BIT ? 8 : 4, 256), true);
        }

        public void getId(ma_device_id toCopyTo) {
            toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 8 : 4, 256);
        }

        public void setId(ma_device_id toCopyFrom) {
            getBufPtr().copyFrom(CHandler.IS_64_BIT ? 8 : 4, toCopyFrom.getBufPtr(), 0, 256);
        }

        public BytePointer name() {
            return new BytePointer(getPointer() + (CHandler.IS_64_BIT ? 264 : 260), false, 256);
        }

        public void name(BytePointer toSetPtr) {
            toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 264 : 260), 256, this);
        }

        public BytePointer getName() {
            return new BytePointer(getBufPtr().duplicate(CHandler.IS_64_BIT ? 264 : 260, 256), false, 256);
        }

        public void getName(BytePointer toCopyTo) {
            toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 264 : 260, 256);
        }

        public void setName(BytePointer toCopyFrom) {
            getBufPtr().copyFrom(CHandler.IS_64_BIT ? 264 : 260, toCopyFrom.getBufPtr(), 0, 256);
        }

        public ma_share_mode shareMode() {
            return ma_share_mode.getByIndex((int) getBufPtr().getUInt(CHandler.IS_64_BIT ? 520 : 516));
        }

        public void shareMode(ma_share_mode shareMode) {
            getBufPtr().setUInt(CHandler.IS_64_BIT ? 520 : 516, shareMode.getIndex());
        }

        public ma_format format() {
            return ma_format.getByIndex((int) getBufPtr().getUInt(CHandler.IS_64_BIT ? 524 : 520));
        }

        public void format(ma_format format) {
            getBufPtr().setUInt(CHandler.IS_64_BIT ? 524 : 520, format.getIndex());
        }

        public long channels() {
            return getBufPtr().getUInt(CHandler.IS_64_BIT ? 528 : 524);
        }

        public void channels(long channels) {
            getBufPtr().setUInt(CHandler.IS_64_BIT ? 528 : 524, channels);
        }

        public UBytePointer channelMap() {
            return new UBytePointer(getPointer() + (CHandler.IS_64_BIT ? 532 : 528), false, 254);
        }

        public void channelMap(UBytePointer toSetPtr) {
            toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 532 : 528), 254, this);
        }

        public UBytePointer getChannelMap() {
            return new UBytePointer(getBufPtr().duplicate(CHandler.IS_64_BIT ? 532 : 528, 254), false, 254);
        }

        public void getChannelMap(UBytePointer toCopyTo) {
            toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 532 : 528, 254);
        }

        public void setChannelMap(UBytePointer toCopyFrom) {
            getBufPtr().copyFrom(CHandler.IS_64_BIT ? 532 : 528, toCopyFrom.getBufPtr(), 0, 254);
        }

        public ma_format internalFormat() {
            return ma_format.getByIndex((int) getBufPtr().getUInt(CHandler.IS_64_BIT ? 788 : 784));
        }

        public void internalFormat(ma_format internalFormat) {
            getBufPtr().setUInt(CHandler.IS_64_BIT ? 788 : 784, internalFormat.getIndex());
        }

        public long internalChannels() {
            return getBufPtr().getUInt(CHandler.IS_64_BIT ? 792 : 788);
        }

        public void internalChannels(long internalChannels) {
            getBufPtr().setUInt(CHandler.IS_64_BIT ? 792 : 788, internalChannels);
        }

        public long internalSampleRate() {
            return getBufPtr().getUInt(CHandler.IS_64_BIT ? 796 : 792);
        }

        public void internalSampleRate(long internalSampleRate) {
            getBufPtr().setUInt(CHandler.IS_64_BIT ? 796 : 792, internalSampleRate);
        }

        public UBytePointer internalChannelMap() {
            return new UBytePointer(getPointer() + (CHandler.IS_64_BIT ? 800 : 796), false, 254);
        }

        public void internalChannelMap(UBytePointer toSetPtr) {
            toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 800 : 796), 254, this);
        }

        public UBytePointer getInternalChannelMap() {
            return new UBytePointer(getBufPtr().duplicate(CHandler.IS_64_BIT ? 800 : 796, 254), false, 254);
        }

        public void getInternalChannelMap(UBytePointer toCopyTo) {
            toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 800 : 796, 254);
        }

        public void setInternalChannelMap(UBytePointer toCopyFrom) {
            getBufPtr().copyFrom(CHandler.IS_64_BIT ? 800 : 796, toCopyFrom.getBufPtr(), 0, 254);
        }

        public long internalPeriodSizeInFrames() {
            return getBufPtr().getUInt(CHandler.IS_64_BIT ? 1056 : 1052);
        }

        public void internalPeriodSizeInFrames(long internalPeriodSizeInFrames) {
            getBufPtr().setUInt(CHandler.IS_64_BIT ? 1056 : 1052, internalPeriodSizeInFrames);
        }

        public long internalPeriods() {
            return getBufPtr().getUInt(CHandler.IS_64_BIT ? 1060 : 1056);
        }

        public void internalPeriods(long internalPeriods) {
            getBufPtr().setUInt(CHandler.IS_64_BIT ? 1060 : 1056, internalPeriods);
        }

        public ma_channel_mix_mode channelMixMode() {
            return ma_channel_mix_mode.getByIndex((int) getBufPtr().getUInt(CHandler.IS_64_BIT ? 1064 : 1060));
        }

        public void channelMixMode(ma_channel_mix_mode channelMixMode) {
            getBufPtr().setUInt(CHandler.IS_64_BIT ? 1064 : 1060, channelMixMode.getIndex());
        }

        public long calculateLFEFromSpatialChannels() {
            return getBufPtr().getUInt(CHandler.IS_64_BIT ? 1068 : 1064);
        }

        public void calculateLFEFromSpatialChannels(long calculateLFEFromSpatialChannels) {
            getBufPtr().setUInt(CHandler.IS_64_BIT ? 1068 : 1064, calculateLFEFromSpatialChannels);
        }

        public ma_data_converter converter() {
            return new ma_data_converter(getPointer() + (CHandler.IS_COMPILED_ANDROID_X86 ? 1068 : 1072), false);
        }

        public void converter(ma_data_converter toSetPtr) {
            toSetPtr.setPointer(getPointer() + (CHandler.IS_COMPILED_ANDROID_X86 ? 1068 : 1072), (CHandler.IS_COMPILED_ANDROID_X86) ? 220 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 240 : 312, this);
        }

        public ma_data_converter getConverter() {
            return new ma_data_converter(getBufPtr().duplicate(CHandler.IS_COMPILED_ANDROID_X86 ? 1068 : 1072, (CHandler.IS_COMPILED_ANDROID_X86) ? 220 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 240 : 312), true);
        }

        public void getConverter(ma_data_converter toCopyTo) {
            toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_COMPILED_ANDROID_X86 ? 1068 : 1072, (CHandler.IS_COMPILED_ANDROID_X86) ? 220 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 240 : 312);
        }

        public void setConverter(ma_data_converter toCopyFrom) {
            getBufPtr().copyFrom(CHandler.IS_COMPILED_ANDROID_X86 ? 1068 : 1072, toCopyFrom.getBufPtr(), 0, (CHandler.IS_COMPILED_ANDROID_X86) ? 220 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 240 : 312);
        }

        public VoidPointer pIntermediaryBuffer() {
            return new VoidPointer(getBufPtr().getNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 1288 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 1312 : 1384), false);
        }

        public void pIntermediaryBuffer(VoidPointer pIntermediaryBuffer) {
            getBufPtr().setNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 1288 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 1312 : 1384, pIntermediaryBuffer.getPointer());
        }

        public long intermediaryBufferCap() {
            return getBufPtr().getUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 1292 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 1392 : 1316);
        }

        public void intermediaryBufferCap(long intermediaryBufferCap) {
            getBufPtr().setUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 1292 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 1392 : 1316, intermediaryBufferCap);
        }

        public long intermediaryBufferLen() {
            return getBufPtr().getUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 1296 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 1396 : 1320);
        }

        public void intermediaryBufferLen(long intermediaryBufferLen) {
            getBufPtr().setUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 1296 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 1396 : 1320, intermediaryBufferLen);
        }

        public VoidPointer pInputCache() {
            return new VoidPointer(getBufPtr().getNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 1300 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 1400 : 1324), false);
        }

        public void pInputCache(VoidPointer pInputCache) {
            getBufPtr().setNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 1300 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 1400 : 1324, pInputCache.getPointer());
        }

        public long inputCacheCap() {
            return getBufPtr().getLong((CHandler.IS_COMPILED_ANDROID_X86) ? 1304 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 1408 : 1328);
        }

        public void inputCacheCap(long inputCacheCap) {
            getBufPtr().setLong((CHandler.IS_COMPILED_ANDROID_X86) ? 1304 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 1408 : 1328, inputCacheCap);
        }

        public long inputCacheConsumed() {
            return getBufPtr().getLong((CHandler.IS_COMPILED_ANDROID_X86) ? 1312 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 1416 : 1336);
        }

        public void inputCacheConsumed(long inputCacheConsumed) {
            getBufPtr().setLong((CHandler.IS_COMPILED_ANDROID_X86) ? 1312 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 1416 : 1336, inputCacheConsumed);
        }

        public long inputCacheRemaining() {
            return getBufPtr().getLong((CHandler.IS_COMPILED_ANDROID_X86) ? 1320 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 1424 : 1344);
        }

        public void inputCacheRemaining(long inputCacheRemaining) {
            getBufPtr().setLong((CHandler.IS_COMPILED_ANDROID_X86) ? 1320 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 1424 : 1344, inputCacheRemaining);
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
            __ffi_type = FFITypes.getCTypeInfo(40).getFfiType();
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

        public ma_device_id.ma_device_idPointer pID() {
            return new ma_device_id.ma_device_idPointer(getBufPtr().getNativePointer(0), false);
        }

        public void pID(ma_device_id.ma_device_idPointer pID) {
            getBufPtr().setNativePointer(0, pID.getPointer());
        }

        public ma_device_id id() {
            return new ma_device_id(getPointer() + (CHandler.IS_64_BIT ? 8 : 4), false);
        }

        public void id(ma_device_id toSetPtr) {
            toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 8 : 4), 256, this);
        }

        public ma_device_id getId() {
            return new ma_device_id(getBufPtr().duplicate(CHandler.IS_64_BIT ? 8 : 4, 256), true);
        }

        public void getId(ma_device_id toCopyTo) {
            toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 8 : 4, 256);
        }

        public void setId(ma_device_id toCopyFrom) {
            getBufPtr().copyFrom(CHandler.IS_64_BIT ? 8 : 4, toCopyFrom.getBufPtr(), 0, 256);
        }

        public BytePointer name() {
            return new BytePointer(getPointer() + (CHandler.IS_64_BIT ? 264 : 260), false, 256);
        }

        public void name(BytePointer toSetPtr) {
            toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 264 : 260), 256, this);
        }

        public BytePointer getName() {
            return new BytePointer(getBufPtr().duplicate(CHandler.IS_64_BIT ? 264 : 260, 256), false, 256);
        }

        public void getName(BytePointer toCopyTo) {
            toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 264 : 260, 256);
        }

        public void setName(BytePointer toCopyFrom) {
            getBufPtr().copyFrom(CHandler.IS_64_BIT ? 264 : 260, toCopyFrom.getBufPtr(), 0, 256);
        }

        public ma_share_mode shareMode() {
            return ma_share_mode.getByIndex((int) getBufPtr().getUInt(CHandler.IS_64_BIT ? 520 : 516));
        }

        public void shareMode(ma_share_mode shareMode) {
            getBufPtr().setUInt(CHandler.IS_64_BIT ? 520 : 516, shareMode.getIndex());
        }

        public ma_format format() {
            return ma_format.getByIndex((int) getBufPtr().getUInt(CHandler.IS_64_BIT ? 524 : 520));
        }

        public void format(ma_format format) {
            getBufPtr().setUInt(CHandler.IS_64_BIT ? 524 : 520, format.getIndex());
        }

        public long channels() {
            return getBufPtr().getUInt(CHandler.IS_64_BIT ? 528 : 524);
        }

        public void channels(long channels) {
            getBufPtr().setUInt(CHandler.IS_64_BIT ? 528 : 524, channels);
        }

        public UBytePointer channelMap() {
            return new UBytePointer(getPointer() + (CHandler.IS_64_BIT ? 532 : 528), false, 254);
        }

        public void channelMap(UBytePointer toSetPtr) {
            toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 532 : 528), 254, this);
        }

        public UBytePointer getChannelMap() {
            return new UBytePointer(getBufPtr().duplicate(CHandler.IS_64_BIT ? 532 : 528, 254), false, 254);
        }

        public void getChannelMap(UBytePointer toCopyTo) {
            toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 532 : 528, 254);
        }

        public void setChannelMap(UBytePointer toCopyFrom) {
            getBufPtr().copyFrom(CHandler.IS_64_BIT ? 532 : 528, toCopyFrom.getBufPtr(), 0, 254);
        }

        public ma_format internalFormat() {
            return ma_format.getByIndex((int) getBufPtr().getUInt(CHandler.IS_64_BIT ? 788 : 784));
        }

        public void internalFormat(ma_format internalFormat) {
            getBufPtr().setUInt(CHandler.IS_64_BIT ? 788 : 784, internalFormat.getIndex());
        }

        public long internalChannels() {
            return getBufPtr().getUInt(CHandler.IS_64_BIT ? 792 : 788);
        }

        public void internalChannels(long internalChannels) {
            getBufPtr().setUInt(CHandler.IS_64_BIT ? 792 : 788, internalChannels);
        }

        public long internalSampleRate() {
            return getBufPtr().getUInt(CHandler.IS_64_BIT ? 796 : 792);
        }

        public void internalSampleRate(long internalSampleRate) {
            getBufPtr().setUInt(CHandler.IS_64_BIT ? 796 : 792, internalSampleRate);
        }

        public UBytePointer internalChannelMap() {
            return new UBytePointer(getPointer() + (CHandler.IS_64_BIT ? 800 : 796), false, 254);
        }

        public void internalChannelMap(UBytePointer toSetPtr) {
            toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 800 : 796), 254, this);
        }

        public UBytePointer getInternalChannelMap() {
            return new UBytePointer(getBufPtr().duplicate(CHandler.IS_64_BIT ? 800 : 796, 254), false, 254);
        }

        public void getInternalChannelMap(UBytePointer toCopyTo) {
            toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 800 : 796, 254);
        }

        public void setInternalChannelMap(UBytePointer toCopyFrom) {
            getBufPtr().copyFrom(CHandler.IS_64_BIT ? 800 : 796, toCopyFrom.getBufPtr(), 0, 254);
        }

        public long internalPeriodSizeInFrames() {
            return getBufPtr().getUInt(CHandler.IS_64_BIT ? 1056 : 1052);
        }

        public void internalPeriodSizeInFrames(long internalPeriodSizeInFrames) {
            getBufPtr().setUInt(CHandler.IS_64_BIT ? 1056 : 1052, internalPeriodSizeInFrames);
        }

        public long internalPeriods() {
            return getBufPtr().getUInt(CHandler.IS_64_BIT ? 1060 : 1056);
        }

        public void internalPeriods(long internalPeriods) {
            getBufPtr().setUInt(CHandler.IS_64_BIT ? 1060 : 1056, internalPeriods);
        }

        public ma_channel_mix_mode channelMixMode() {
            return ma_channel_mix_mode.getByIndex((int) getBufPtr().getUInt(CHandler.IS_64_BIT ? 1064 : 1060));
        }

        public void channelMixMode(ma_channel_mix_mode channelMixMode) {
            getBufPtr().setUInt(CHandler.IS_64_BIT ? 1064 : 1060, channelMixMode.getIndex());
        }

        public long calculateLFEFromSpatialChannels() {
            return getBufPtr().getUInt(CHandler.IS_64_BIT ? 1068 : 1064);
        }

        public void calculateLFEFromSpatialChannels(long calculateLFEFromSpatialChannels) {
            getBufPtr().setUInt(CHandler.IS_64_BIT ? 1068 : 1064, calculateLFEFromSpatialChannels);
        }

        public ma_data_converter converter() {
            return new ma_data_converter(getPointer() + (CHandler.IS_COMPILED_ANDROID_X86 ? 1068 : 1072), false);
        }

        public void converter(ma_data_converter toSetPtr) {
            toSetPtr.setPointer(getPointer() + (CHandler.IS_COMPILED_ANDROID_X86 ? 1068 : 1072), (CHandler.IS_COMPILED_ANDROID_X86) ? 220 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 240 : 312, this);
        }

        public ma_data_converter getConverter() {
            return new ma_data_converter(getBufPtr().duplicate(CHandler.IS_COMPILED_ANDROID_X86 ? 1068 : 1072, (CHandler.IS_COMPILED_ANDROID_X86) ? 220 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 240 : 312), true);
        }

        public void getConverter(ma_data_converter toCopyTo) {
            toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_COMPILED_ANDROID_X86 ? 1068 : 1072, (CHandler.IS_COMPILED_ANDROID_X86) ? 220 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 240 : 312);
        }

        public void setConverter(ma_data_converter toCopyFrom) {
            getBufPtr().copyFrom(CHandler.IS_COMPILED_ANDROID_X86 ? 1068 : 1072, toCopyFrom.getBufPtr(), 0, (CHandler.IS_COMPILED_ANDROID_X86) ? 220 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 240 : 312);
        }

        public VoidPointer pIntermediaryBuffer() {
            return new VoidPointer(getBufPtr().getNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 1288 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 1312 : 1384), false);
        }

        public void pIntermediaryBuffer(VoidPointer pIntermediaryBuffer) {
            getBufPtr().setNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 1288 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 1312 : 1384, pIntermediaryBuffer.getPointer());
        }

        public long intermediaryBufferCap() {
            return getBufPtr().getUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 1292 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 1392 : 1316);
        }

        public void intermediaryBufferCap(long intermediaryBufferCap) {
            getBufPtr().setUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 1292 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 1392 : 1316, intermediaryBufferCap);
        }

        public long intermediaryBufferLen() {
            return getBufPtr().getUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 1296 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 1396 : 1320);
        }

        public void intermediaryBufferLen(long intermediaryBufferLen) {
            getBufPtr().setUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 1296 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 1396 : 1320, intermediaryBufferLen);
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

    public final static class coreaudio extends Struct {

        private final static int __size;

        private final static long __ffi_type;

        static {
            __ffi_type = FFITypes.getCTypeInfo(45).getFfiType();
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

    public final static class null_device extends Struct {

        private final static int __size;

        private final static long __ffi_type;

        static {
            __ffi_type = FFITypes.getCTypeInfo(227).getFfiType();
            __size = CHandler.getSizeFromFFIType(__ffi_type);
        }

        public null_device(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public null_device(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public null_device() {
            super(__size);
        }

        public long getSize() {
            return __size;
        }

        public long getFFIType() {
            return __ffi_type;
        }

        public null_device.null_devicePointer asPointer() {
            return new null_device.null_devicePointer(getPointer(), false, 1, this);
        }

        public void asPointer(null_device.null_devicePointer ptr) {
            ptr.setPointer(this);
        }

        public static final class null_devicePointer extends StackElementPointer<null_device> {

            public null_devicePointer(VoidPointer pointer) {
                super(pointer);
            }

            public null_devicePointer(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public null_devicePointer(long pointer, boolean freeOnGC, int capacity) {
                super(pointer, freeOnGC, capacity * __size);
            }

            public null_devicePointer(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public null_devicePointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                super(pointer, freeOnGC, capacity * __size);
                setParent(parent);
            }

            public null_devicePointer() {
                this(1, true);
            }

            public null_devicePointer(int count, boolean freeOnGC) {
                super(__size, count, freeOnGC);
            }

            public int getSize() {
                return __size;
            }

            protected null_device createStackElement(long ptr, boolean freeOnGC) {
                return new null_device(ptr, freeOnGC);
            }
        }
    }
}
