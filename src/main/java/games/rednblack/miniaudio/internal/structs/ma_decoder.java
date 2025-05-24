package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_data_source_base;
import games.rednblack.miniaudio.internal.structs.ma_decoding_backend_vtable;
import com.badlogic.gdx.jnigen.runtime.closure.ClosureObject;
import games.rednblack.miniaudio.internal.GdxMiniaudio;
import games.rednblack.miniaudio.internal.GdxMiniaudio_Internal;
import games.rednblack.miniaudio.internal.enums.ma_format;
import games.rednblack.miniaudio.internal.structs.ma_data_converter;
import games.rednblack.miniaudio.internal.structs.ma_allocation_callbacks;
import games.rednblack.miniaudio.internal.structs.ma_decoder.data;
import com.badlogic.gdx.jnigen.runtime.pointer.Union;
import games.rednblack.miniaudio.internal.structs.ma_decoder.data.vfs;
import games.rednblack.miniaudio.internal.structs.ma_decoder.data.memory;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.UBytePointer;

public final class ma_decoder extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(104).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_decoder(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_decoder(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_decoder() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_decoder.ma_decoderPointer asPointer() {
        return new ma_decoder.ma_decoderPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_decoder.ma_decoderPointer ptr) {
        ptr.setPointer(this);
    }

    public ma_data_source_base ds() {
        return new ma_data_source_base(getPointer(), false);
    }

    public void ds(ma_data_source_base toSetPtr) {
        toSetPtr.setPointer(getPointer(), (CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 56, this);
    }

    public ma_data_source_base getDs() {
        return new ma_data_source_base(getBufPtr().duplicate(0, (CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 56), true);
    }

    public void getDs(ma_data_source_base toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, (CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 56);
    }

    public void setDs(ma_data_source_base toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, (CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 56);
    }

    public VoidPointer pBackend() {
        return new VoidPointer(getBufPtr().getNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 56), false);
    }

    public void pBackend(VoidPointer pBackend) {
        getBufPtr().setNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 56, pBackend.getPointer());
    }

    public ma_decoding_backend_vtable.ma_decoding_backend_vtablePointer pBackendVTable() {
        return new ma_decoding_backend_vtable.ma_decoding_backend_vtablePointer(getBufPtr().getNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 56 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 80 : 60), false);
    }

    public void pBackendVTable(ma_decoding_backend_vtable.ma_decoding_backend_vtablePointer pBackendVTable) {
        getBufPtr().setNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 56 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 80 : 60, pBackendVTable.getPointer());
    }

    public VoidPointer pBackendUserData() {
        return new VoidPointer(getBufPtr().getNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 60 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 64 : 88), false);
    }

    public void pBackendUserData(VoidPointer pBackendUserData) {
        getBufPtr().setNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 60 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 64 : 88, pBackendUserData.getPointer());
    }

    public ClosureObject<GdxMiniaudio.ma_decoder_read_proc> onRead() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 64 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 96 : 68), GdxMiniaudio_Internal.ma_decoder_read_proc_Internal::ma_decoder_read_proc_downcall);
    }

    public void onRead(ClosureObject<GdxMiniaudio.ma_decoder_read_proc> onRead) {
        getBufPtr().setNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 64 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 96 : 68, onRead.getPointer());
    }

    public ClosureObject<GdxMiniaudio.ma_decoder_seek_proc> onSeek() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 68 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 104 : 72), GdxMiniaudio_Internal.ma_decoder_seek_proc_Internal::ma_decoder_seek_proc_downcall);
    }

    public void onSeek(ClosureObject<GdxMiniaudio.ma_decoder_seek_proc> onSeek) {
        getBufPtr().setNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 68 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 104 : 72, onSeek.getPointer());
    }

    public ClosureObject<GdxMiniaudio.ma_decoder_tell_proc> onTell() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 72 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 112 : 76), GdxMiniaudio_Internal.ma_decoder_tell_proc_Internal::ma_decoder_tell_proc_downcall);
    }

    public void onTell(ClosureObject<GdxMiniaudio.ma_decoder_tell_proc> onTell) {
        getBufPtr().setNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 72 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 112 : 76, onTell.getPointer());
    }

    public VoidPointer pUserData() {
        return new VoidPointer(getBufPtr().getNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 76 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 80 : 120), false);
    }

    public void pUserData(VoidPointer pUserData) {
        getBufPtr().setNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 76 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 80 : 120, pUserData.getPointer());
    }

    public long readPointerInPCMFrames() {
        return getBufPtr().getLong((CHandler.IS_COMPILED_ANDROID_X86) ? 80 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 128 : 88);
    }

    public void readPointerInPCMFrames(long readPointerInPCMFrames) {
        getBufPtr().setLong((CHandler.IS_COMPILED_ANDROID_X86) ? 80 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 128 : 88, readPointerInPCMFrames);
    }

    public ma_format outputFormat() {
        return ma_format.getByIndex((int) getBufPtr().getUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 88 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 96 : 136));
    }

    public void outputFormat(ma_format outputFormat) {
        getBufPtr().setUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 88 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 96 : 136, outputFormat.getIndex());
    }

    public long outputChannels() {
        return getBufPtr().getUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 92 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 100 : 140);
    }

    public void outputChannels(long outputChannels) {
        getBufPtr().setUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 92 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 100 : 140, outputChannels);
    }

    public long outputSampleRate() {
        return getBufPtr().getUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 96 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 144 : 104);
    }

    public void outputSampleRate(long outputSampleRate) {
        getBufPtr().setUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 96 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 144 : 104, outputSampleRate);
    }

    public ma_data_converter converter() {
        return new ma_data_converter(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 100 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 112 : 152), false);
    }

    public void converter(ma_data_converter toSetPtr) {
        toSetPtr.setPointer(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 100 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 112 : 152), (CHandler.IS_COMPILED_ANDROID_X86) ? 220 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 240 : 312, this);
    }

    public ma_data_converter getConverter() {
        return new ma_data_converter(getBufPtr().duplicate((CHandler.IS_COMPILED_ANDROID_X86) ? 100 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 112 : 152, (CHandler.IS_COMPILED_ANDROID_X86) ? 220 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 240 : 312), true);
    }

    public void getConverter(ma_data_converter toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), (CHandler.IS_COMPILED_ANDROID_X86) ? 100 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 112 : 152, (CHandler.IS_COMPILED_ANDROID_X86) ? 220 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 240 : 312);
    }

    public void setConverter(ma_data_converter toCopyFrom) {
        getBufPtr().copyFrom((CHandler.IS_COMPILED_ANDROID_X86) ? 100 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 112 : 152, toCopyFrom.getBufPtr(), 0, (CHandler.IS_COMPILED_ANDROID_X86) ? 220 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 240 : 312);
    }

    public VoidPointer pInputCache() {
        return new VoidPointer(getBufPtr().getNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 320 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 464 : 352), false);
    }

    public void pInputCache(VoidPointer pInputCache) {
        getBufPtr().setNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 320 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 464 : 352, pInputCache.getPointer());
    }

    public long inputCacheCap() {
        return getBufPtr().getLong((CHandler.IS_COMPILED_ANDROID_X86) ? 324 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 472 : 360);
    }

    public void inputCacheCap(long inputCacheCap) {
        getBufPtr().setLong((CHandler.IS_COMPILED_ANDROID_X86) ? 324 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 472 : 360, inputCacheCap);
    }

    public long inputCacheConsumed() {
        return getBufPtr().getLong((CHandler.IS_COMPILED_ANDROID_X86) ? 332 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 480 : 368);
    }

    public void inputCacheConsumed(long inputCacheConsumed) {
        getBufPtr().setLong((CHandler.IS_COMPILED_ANDROID_X86) ? 332 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 480 : 368, inputCacheConsumed);
    }

    public long inputCacheRemaining() {
        return getBufPtr().getLong((CHandler.IS_COMPILED_ANDROID_X86) ? 340 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 488 : 376);
    }

    public void inputCacheRemaining(long inputCacheRemaining) {
        getBufPtr().setLong((CHandler.IS_COMPILED_ANDROID_X86) ? 340 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 488 : 376, inputCacheRemaining);
    }

    public ma_allocation_callbacks allocationCallbacks() {
        return new ma_allocation_callbacks(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 348 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 496 : 384), false);
    }

    public void allocationCallbacks(ma_allocation_callbacks toSetPtr) {
        toSetPtr.setPointer(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 348 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 496 : 384), CHandler.IS_64_BIT ? 32 : 16, this);
    }

    public ma_allocation_callbacks getAllocationCallbacks() {
        return new ma_allocation_callbacks(getBufPtr().duplicate((CHandler.IS_COMPILED_ANDROID_X86) ? 348 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 496 : 384, CHandler.IS_64_BIT ? 32 : 16), true);
    }

    public void getAllocationCallbacks(ma_allocation_callbacks toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), (CHandler.IS_COMPILED_ANDROID_X86) ? 348 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 496 : 384, CHandler.IS_64_BIT ? 32 : 16);
    }

    public void setAllocationCallbacks(ma_allocation_callbacks toCopyFrom) {
        getBufPtr().copyFrom((CHandler.IS_COMPILED_ANDROID_X86) ? 348 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 496 : 384, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 32 : 16);
    }

    public data data() {
        return new data(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 364 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 528 : 400), false);
    }

    public void data(data toSetPtr) {
        toSetPtr.setPointer(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 364 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 528 : 400), ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 16 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 24 : 12, this);
    }

    public data getData() {
        return new data(getBufPtr().duplicate((CHandler.IS_COMPILED_ANDROID_X86) ? 364 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 528 : 400, ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 16 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 24 : 12), true);
    }

    public void getData(data toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), (CHandler.IS_COMPILED_ANDROID_X86) ? 364 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 528 : 400, ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 16 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 24 : 12);
    }

    public void setData(data toCopyFrom) {
        getBufPtr().copyFrom((CHandler.IS_COMPILED_ANDROID_X86) ? 364 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 528 : 400, toCopyFrom.getBufPtr(), 0, ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 16 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 24 : 12);
    }

    public static final class ma_decoderPointer extends StackElementPointer<ma_decoder> {

        public ma_decoderPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_decoderPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_decoderPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_decoderPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_decoderPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_decoderPointer() {
            this(1, true);
        }

        public ma_decoderPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_decoder createStackElement(long ptr, boolean freeOnGC) {
            return new ma_decoder(ptr, freeOnGC);
        }
    }

    public final static class data extends Union {

        private final static int __size;

        private final static long __ffi_type;

        static {
            __ffi_type = FFITypes.getCTypeInfo(51).getFfiType();
            __size = CHandler.getSizeFromFFIType(__ffi_type);
        }

        public data(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public data(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public data() {
            super(__size);
        }

        public long getSize() {
            return __size;
        }

        public long getFFIType() {
            return __ffi_type;
        }

        public data.dataPointer asPointer() {
            return new data.dataPointer(getPointer(), false, 1, this);
        }

        public void asPointer(data.dataPointer ptr) {
            ptr.setPointer(this);
        }

        public vfs vfs() {
            return new vfs(getPointer(), false);
        }

        public void vfs(vfs toSetPtr) {
            toSetPtr.setPointer(getPointer(), CHandler.IS_64_BIT ? 16 : 8, this);
        }

        public vfs getVfs() {
            return new vfs(getBufPtr().duplicate(0, CHandler.IS_64_BIT ? 16 : 8), true);
        }

        public void getVfs(vfs toCopyTo) {
            toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, CHandler.IS_64_BIT ? 16 : 8);
        }

        public void setVfs(vfs toCopyFrom) {
            getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 16 : 8);
        }

        public memory memory() {
            return new memory(getPointer(), false);
        }

        public void memory(memory toSetPtr) {
            toSetPtr.setPointer(getPointer(), ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 16 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 24 : 12, this);
        }

        public memory getMemory() {
            return new memory(getBufPtr().duplicate(0, ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 16 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 24 : 12), true);
        }

        public void getMemory(memory toCopyTo) {
            toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 16 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 24 : 12);
        }

        public void setMemory(memory toCopyFrom) {
            getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 16 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 24 : 12);
        }

        public static final class dataPointer extends StackElementPointer<data> {

            public dataPointer(VoidPointer pointer) {
                super(pointer);
            }

            public dataPointer(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public dataPointer(long pointer, boolean freeOnGC, int capacity) {
                super(pointer, freeOnGC, capacity * __size);
            }

            public dataPointer(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public dataPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                super(pointer, freeOnGC, capacity * __size);
                setParent(parent);
            }

            public dataPointer() {
                this(1, true);
            }

            public dataPointer(int count, boolean freeOnGC) {
                super(__size, count, freeOnGC);
            }

            public int getSize() {
                return __size;
            }

            protected data createStackElement(long ptr, boolean freeOnGC) {
                return new data(ptr, freeOnGC);
            }
        }

        public final static class vfs extends Struct {

            private final static int __size;

            private final static long __ffi_type;

            static {
                __ffi_type = FFITypes.getCTypeInfo(247).getFfiType();
                __size = CHandler.getSizeFromFFIType(__ffi_type);
            }

            public vfs(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public vfs(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public vfs() {
                super(__size);
            }

            public long getSize() {
                return __size;
            }

            public long getFFIType() {
                return __ffi_type;
            }

            public vfs.vfsPointer asPointer() {
                return new vfs.vfsPointer(getPointer(), false, 1, this);
            }

            public void asPointer(vfs.vfsPointer ptr) {
                ptr.setPointer(this);
            }

            public VoidPointer pVFS() {
                return new VoidPointer(getBufPtr().getNativePointer(0), false);
            }

            public void pVFS(VoidPointer pVFS) {
                getBufPtr().setNativePointer(0, pVFS.getPointer());
            }

            public VoidPointer file() {
                return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false);
            }

            public void file(VoidPointer file) {
                getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 8 : 4, file.getPointer());
            }

            public static final class vfsPointer extends StackElementPointer<vfs> {

                public vfsPointer(VoidPointer pointer) {
                    super(pointer);
                }

                public vfsPointer(long pointer, boolean freeOnGC) {
                    super(pointer, freeOnGC);
                }

                public vfsPointer(long pointer, boolean freeOnGC, int capacity) {
                    super(pointer, freeOnGC, capacity * __size);
                }

                public vfsPointer(long pointer, boolean freeOnGC, Pointing parent) {
                    super(pointer, freeOnGC);
                    setParent(parent);
                }

                public vfsPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                    super(pointer, freeOnGC, capacity * __size);
                    setParent(parent);
                }

                public vfsPointer() {
                    this(1, true);
                }

                public vfsPointer(int count, boolean freeOnGC) {
                    super(__size, count, freeOnGC);
                }

                public int getSize() {
                    return __size;
                }

                protected vfs createStackElement(long ptr, boolean freeOnGC) {
                    return new vfs(ptr, freeOnGC);
                }
            }
        }

        public final static class memory extends Struct {

            private final static int __size;

            private final static long __ffi_type;

            static {
                __ffi_type = FFITypes.getCTypeInfo(224).getFfiType();
                __size = CHandler.getSizeFromFFIType(__ffi_type);
            }

            public memory(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public memory(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public memory() {
                super(__size);
            }

            public long getSize() {
                return __size;
            }

            public long getFFIType() {
                return __ffi_type;
            }

            public memory.memoryPointer asPointer() {
                return new memory.memoryPointer(getPointer(), false, 1, this);
            }

            public void asPointer(memory.memoryPointer ptr) {
                ptr.setPointer(this);
            }

            public UBytePointer pData() {
                return new UBytePointer(getBufPtr().getNativePointer(0), false);
            }

            public void pData(UBytePointer pData) {
                getBufPtr().setNativePointer(0, pData.getPointer());
            }

            public long dataSize() {
                return getBufPtr().getNativeULong(CHandler.IS_64_BIT ? 8 : 4);
            }

            public void dataSize(long dataSize) {
                getBufPtr().setNativeULong(CHandler.IS_64_BIT ? 8 : 4, dataSize);
            }

            public long currentReadPos() {
                return getBufPtr().getNativeULong(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 16 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 12 : 8);
            }

            public void currentReadPos(long currentReadPos) {
                getBufPtr().setNativeULong(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 16 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 12 : 8, currentReadPos);
            }

            public static final class memoryPointer extends StackElementPointer<memory> {

                public memoryPointer(VoidPointer pointer) {
                    super(pointer);
                }

                public memoryPointer(long pointer, boolean freeOnGC) {
                    super(pointer, freeOnGC);
                }

                public memoryPointer(long pointer, boolean freeOnGC, int capacity) {
                    super(pointer, freeOnGC, capacity * __size);
                }

                public memoryPointer(long pointer, boolean freeOnGC, Pointing parent) {
                    super(pointer, freeOnGC);
                    setParent(parent);
                }

                public memoryPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                    super(pointer, freeOnGC, capacity * __size);
                    setParent(parent);
                }

                public memoryPointer() {
                    this(1, true);
                }

                public memoryPointer(int count, boolean freeOnGC) {
                    super(__size, count, freeOnGC);
                }

                public int getSize() {
                    return __size;
                }

                protected memory createStackElement(long ptr, boolean freeOnGC) {
                    return new memory(ptr, freeOnGC);
                }
            }
        }
    }
}
