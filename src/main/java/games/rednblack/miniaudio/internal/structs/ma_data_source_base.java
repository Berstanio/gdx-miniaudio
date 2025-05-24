package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_data_source_vtable;
import com.badlogic.gdx.jnigen.runtime.closure.ClosureObject;
import games.rednblack.miniaudio.internal.GdxMiniaudio;
import games.rednblack.miniaudio.internal.GdxMiniaudio_Internal;

public final class ma_data_source_base extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(99).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_data_source_base(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_data_source_base(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_data_source_base() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_data_source_base.ma_data_source_basePointer asPointer() {
        return new ma_data_source_base.ma_data_source_basePointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_data_source_base.ma_data_source_basePointer ptr) {
        ptr.setPointer(this);
    }

    public ma_data_source_vtable.ma_data_source_vtablePointer vtable() {
        return new ma_data_source_vtable.ma_data_source_vtablePointer(getBufPtr().getNativePointer(0), false);
    }

    public void vtable(ma_data_source_vtable.ma_data_source_vtablePointer vtable) {
        getBufPtr().setNativePointer(0, vtable.getPointer());
    }

    public long rangeBegInFrames() {
        return getBufPtr().getLong(CHandler.IS_COMPILED_ANDROID_X86 ? 4 : 8);
    }

    public void rangeBegInFrames(long rangeBegInFrames) {
        getBufPtr().setLong(CHandler.IS_COMPILED_ANDROID_X86 ? 4 : 8, rangeBegInFrames);
    }

    public long rangeEndInFrames() {
        return getBufPtr().getLong(CHandler.IS_COMPILED_ANDROID_X86 ? 12 : 16);
    }

    public void rangeEndInFrames(long rangeEndInFrames) {
        getBufPtr().setLong(CHandler.IS_COMPILED_ANDROID_X86 ? 12 : 16, rangeEndInFrames);
    }

    public long loopBegInFrames() {
        return getBufPtr().getLong(CHandler.IS_COMPILED_ANDROID_X86 ? 20 : 24);
    }

    public void loopBegInFrames(long loopBegInFrames) {
        getBufPtr().setLong(CHandler.IS_COMPILED_ANDROID_X86 ? 20 : 24, loopBegInFrames);
    }

    public long loopEndInFrames() {
        return getBufPtr().getLong(CHandler.IS_COMPILED_ANDROID_X86 ? 28 : 32);
    }

    public void loopEndInFrames(long loopEndInFrames) {
        getBufPtr().setLong(CHandler.IS_COMPILED_ANDROID_X86 ? 28 : 32, loopEndInFrames);
    }

    public VoidPointer pCurrent() {
        return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_COMPILED_ANDROID_X86 ? 36 : 40), false);
    }

    public void pCurrent(VoidPointer pCurrent) {
        getBufPtr().setNativePointer(CHandler.IS_COMPILED_ANDROID_X86 ? 36 : 40, pCurrent.getPointer());
    }

    public VoidPointer pNext() {
        return new VoidPointer(getBufPtr().getNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 40 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 48 : 44), false);
    }

    public void pNext(VoidPointer pNext) {
        getBufPtr().setNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 40 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 48 : 44, pNext.getPointer());
    }

    public ClosureObject<GdxMiniaudio.ma_data_source_get_next_proc> onGetNext() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 44 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 48 : 56), GdxMiniaudio_Internal.ma_data_source_get_next_proc_Internal::ma_data_source_get_next_proc_downcall);
    }

    public void onGetNext(ClosureObject<GdxMiniaudio.ma_data_source_get_next_proc> onGetNext) {
        getBufPtr().setNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 44 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 48 : 56, onGetNext.getPointer());
    }

    public long isLooping() {
        return getBufPtr().getUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 48 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 64 : 52);
    }

    public void isLooping(long isLooping) {
        getBufPtr().setUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 48 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 64 : 52, isLooping);
    }

    public static final class ma_data_source_basePointer extends StackElementPointer<ma_data_source_base> {

        public ma_data_source_basePointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_data_source_basePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_data_source_basePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_data_source_basePointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_data_source_basePointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_data_source_basePointer() {
            this(1, true);
        }

        public ma_data_source_basePointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_data_source_base createStackElement(long ptr, boolean freeOnGC) {
            return new ma_data_source_base(ptr, freeOnGC);
        }
    }
}
