package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_data_source_base;
import games.rednblack.miniaudio.internal.structs.ma_resource_manager;
import games.rednblack.miniaudio.internal.structs.ma_decoder;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.UIntPointer;
import games.rednblack.miniaudio.internal.enums.ma_result;

public final class ma_resource_manager_data_stream extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(201).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_resource_manager_data_stream(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_resource_manager_data_stream(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_resource_manager_data_stream() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_resource_manager_data_stream.ma_resource_manager_data_streamPointer asPointer() {
        return new ma_resource_manager_data_stream.ma_resource_manager_data_streamPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_resource_manager_data_stream.ma_resource_manager_data_streamPointer ptr) {
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

    public ma_resource_manager.ma_resource_managerPointer pResourceManager() {
        return new ma_resource_manager.ma_resource_managerPointer(getBufPtr().getNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 56), false);
    }

    public void pResourceManager(ma_resource_manager.ma_resource_managerPointer pResourceManager) {
        getBufPtr().setNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 56, pResourceManager.getPointer());
    }

    public long flags() {
        return getBufPtr().getUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 56 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 80 : 60);
    }

    public void flags(long flags) {
        getBufPtr().setUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 56 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 80 : 60, flags);
    }

    public ma_decoder decoder() {
        return new ma_decoder(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 60 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 64 : 88), false);
    }

    public void decoder(ma_decoder toSetPtr) {
        toSetPtr.setPointer(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 60 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 64 : 88), ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 544 : (CHandler.IS_COMPILED_ANDROID_X86) ? 376 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 552 : 416, this);
    }

    public ma_decoder getDecoder() {
        return new ma_decoder(getBufPtr().duplicate((CHandler.IS_COMPILED_ANDROID_X86) ? 60 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 64 : 88, ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 544 : (CHandler.IS_COMPILED_ANDROID_X86) ? 376 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 552 : 416), true);
    }

    public void getDecoder(ma_decoder toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), (CHandler.IS_COMPILED_ANDROID_X86) ? 60 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 64 : 88, ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 544 : (CHandler.IS_COMPILED_ANDROID_X86) ? 376 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 552 : 416);
    }

    public void setDecoder(ma_decoder toCopyFrom) {
        getBufPtr().copyFrom((CHandler.IS_COMPILED_ANDROID_X86) ? 60 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 64 : 88, toCopyFrom.getBufPtr(), 0, ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 544 : (CHandler.IS_COMPILED_ANDROID_X86) ? 376 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 552 : 416);
    }

    public long isDecoderInitialized() {
        return getBufPtr().getUInt(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 640 : (CHandler.IS_COMPILED_ANDROID_X86) ? 436 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 632 : 480);
    }

    public void isDecoderInitialized(long isDecoderInitialized) {
        getBufPtr().setUInt(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 640 : (CHandler.IS_COMPILED_ANDROID_X86) ? 436 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 632 : 480, isDecoderInitialized);
    }

    public long totalLengthInPCMFrames() {
        return getBufPtr().getLong(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 640 : (CHandler.IS_COMPILED_ANDROID_X86) ? 440 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 648 : 488);
    }

    public void totalLengthInPCMFrames(long totalLengthInPCMFrames) {
        getBufPtr().setLong(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 640 : (CHandler.IS_COMPILED_ANDROID_X86) ? 440 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 648 : 488, totalLengthInPCMFrames);
    }

    public long relativeCursor() {
        return getBufPtr().getUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 448 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 656 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 648 : 496);
    }

    public void relativeCursor(long relativeCursor) {
        getBufPtr().setUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 448 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 656 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 648 : 496, relativeCursor);
    }

    public long absoluteCursor() {
        return getBufPtr().getLong(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 656 : (CHandler.IS_COMPILED_ANDROID_X86) ? 452 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 664 : 504);
    }

    public void absoluteCursor(long absoluteCursor) {
        getBufPtr().setLong(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 656 : (CHandler.IS_COMPILED_ANDROID_X86) ? 452 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 664 : 504, absoluteCursor);
    }

    public long currentPageIndex() {
        return getBufPtr().getUInt(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 672 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 664 : (CHandler.IS_COMPILED_ANDROID_X86) ? 460 : 512);
    }

    public void currentPageIndex(long currentPageIndex) {
        getBufPtr().setUInt(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 672 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 664 : (CHandler.IS_COMPILED_ANDROID_X86) ? 460 : 512, currentPageIndex);
    }

    public long executionCounter() {
        return getBufPtr().getUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 464 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 676 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 668 : 516);
    }

    public void executionCounter(long executionCounter) {
        getBufPtr().setUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 464 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 676 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 668 : 516, executionCounter);
    }

    public long executionPointer() {
        return getBufPtr().getUInt(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 672 : (CHandler.IS_COMPILED_ANDROID_X86) ? 468 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 680 : 520);
    }

    public void executionPointer(long executionPointer) {
        getBufPtr().setUInt(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 672 : (CHandler.IS_COMPILED_ANDROID_X86) ? 468 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 680 : 520, executionPointer);
    }

    public long isLooping() {
        return getBufPtr().getUInt(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 676 : (CHandler.IS_COMPILED_ANDROID_X86) ? 472 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 684 : 524);
    }

    public void isLooping(long isLooping) {
        getBufPtr().setUInt(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 676 : (CHandler.IS_COMPILED_ANDROID_X86) ? 472 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 684 : 524, isLooping);
    }

    public VoidPointer pPageData() {
        return new VoidPointer(getBufPtr().getNativePointer(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 688 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 680 : (CHandler.IS_COMPILED_ANDROID_X86) ? 476 : 528), false);
    }

    public void pPageData(VoidPointer pPageData) {
        getBufPtr().setNativePointer(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 688 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 680 : (CHandler.IS_COMPILED_ANDROID_X86) ? 476 : 528, pPageData.getPointer());
    }

    public UIntPointer pageFrameCount() {
        return new UIntPointer(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 480 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 688 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 696 : 532), false, 2);
    }

    public void pageFrameCount(UIntPointer toSetPtr) {
        toSetPtr.setPointer(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 480 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 688 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 696 : 532), 8, this);
    }

    public UIntPointer getPageFrameCount() {
        return new UIntPointer(getBufPtr().duplicate((CHandler.IS_COMPILED_ANDROID_X86) ? 480 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 688 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 696 : 532, 8), false, 2);
    }

    public void getPageFrameCount(UIntPointer toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), (CHandler.IS_COMPILED_ANDROID_X86) ? 480 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 688 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 696 : 532, 8);
    }

    public void setPageFrameCount(UIntPointer toCopyFrom) {
        getBufPtr().copyFrom((CHandler.IS_COMPILED_ANDROID_X86) ? 480 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 688 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 696 : 532, toCopyFrom.getBufPtr(), 0, 8);
    }

    public ma_result result() {
        return ma_result.getByIndex((int) getBufPtr().getInt(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 704 : (CHandler.IS_COMPILED_ANDROID_X86) ? 488 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 696 : 540));
    }

    public void result(ma_result result) {
        getBufPtr().setInt(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 704 : (CHandler.IS_COMPILED_ANDROID_X86) ? 488 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 696 : 540, result.getIndex());
    }

    public long isDecoderAtEnd() {
        return getBufPtr().getUInt(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 708 : (CHandler.IS_COMPILED_ANDROID_X86) ? 492 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 700 : 544);
    }

    public void isDecoderAtEnd(long isDecoderAtEnd) {
        getBufPtr().setUInt(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 708 : (CHandler.IS_COMPILED_ANDROID_X86) ? 492 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 700 : 544, isDecoderAtEnd);
    }

    public UIntPointer isPageValid() {
        return new UIntPointer(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 496 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 704 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 712 : 548), false, 2);
    }

    public void isPageValid(UIntPointer toSetPtr) {
        toSetPtr.setPointer(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 496 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 704 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 712 : 548), 8, this);
    }

    public UIntPointer getIsPageValid() {
        return new UIntPointer(getBufPtr().duplicate((CHandler.IS_COMPILED_ANDROID_X86) ? 496 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 704 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 712 : 548, 8), false, 2);
    }

    public void getIsPageValid(UIntPointer toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), (CHandler.IS_COMPILED_ANDROID_X86) ? 496 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 704 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 712 : 548, 8);
    }

    public void setIsPageValid(UIntPointer toCopyFrom) {
        getBufPtr().copyFrom((CHandler.IS_COMPILED_ANDROID_X86) ? 496 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 704 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 712 : 548, toCopyFrom.getBufPtr(), 0, 8);
    }

    public long seekCounter() {
        return getBufPtr().getUInt(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 720 : (CHandler.IS_COMPILED_ANDROID_X86) ? 504 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 712 : 556);
    }

    public void seekCounter(long seekCounter) {
        getBufPtr().setUInt(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 720 : (CHandler.IS_COMPILED_ANDROID_X86) ? 504 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 712 : 556, seekCounter);
    }

    public static final class ma_resource_manager_data_streamPointer extends StackElementPointer<ma_resource_manager_data_stream> {

        public ma_resource_manager_data_streamPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_resource_manager_data_streamPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_resource_manager_data_streamPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_resource_manager_data_streamPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_resource_manager_data_streamPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_resource_manager_data_streamPointer() {
            this(1, true);
        }

        public ma_resource_manager_data_streamPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_resource_manager_data_stream createStackElement(long ptr, boolean freeOnGC) {
            return new ma_resource_manager_data_stream(ptr, freeOnGC);
        }
    }
}
