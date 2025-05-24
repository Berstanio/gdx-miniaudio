package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_sound;
import games.rednblack.miniaudio.internal.structs.ma_sound_inlined;

public final class ma_sound_inlined extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(211).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_sound_inlined(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_sound_inlined(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_sound_inlined() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_sound_inlined.ma_sound_inlinedPointer asPointer() {
        return new ma_sound_inlined.ma_sound_inlinedPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_sound_inlined.ma_sound_inlinedPointer ptr) {
        ptr.setPointer(this);
    }

    public ma_sound sound() {
        return new ma_sound(getPointer(), false);
    }

    public void sound(ma_sound toSetPtr) {
        toSetPtr.setPointer(getPointer(), (CHandler.IS_COMPILED_ANDROID_X86) ? 712 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 736 : 952, this);
    }

    public ma_sound getSound() {
        return new ma_sound(getBufPtr().duplicate(0, (CHandler.IS_COMPILED_ANDROID_X86) ? 712 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 736 : 952), true);
    }

    public void getSound(ma_sound toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, (CHandler.IS_COMPILED_ANDROID_X86) ? 712 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 736 : 952);
    }

    public void setSound(ma_sound toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, (CHandler.IS_COMPILED_ANDROID_X86) ? 712 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 736 : 952);
    }

    public ma_sound_inlined.ma_sound_inlinedPointer pNext() {
        return new ma_sound_inlined.ma_sound_inlinedPointer(getBufPtr().getNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 712 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 736 : 952), false);
    }

    public void pNext(ma_sound_inlined.ma_sound_inlinedPointer pNext) {
        getBufPtr().setNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 712 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 736 : 952, pNext.getPointer());
    }

    public ma_sound_inlined.ma_sound_inlinedPointer pPrev() {
        return new ma_sound_inlined.ma_sound_inlinedPointer(getBufPtr().getNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 716 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 960 : 740), false);
    }

    public void pPrev(ma_sound_inlined.ma_sound_inlinedPointer pPrev) {
        getBufPtr().setNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 716 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 960 : 740, pPrev.getPointer());
    }

    public static final class ma_sound_inlinedPointer extends StackElementPointer<ma_sound_inlined> {

        public ma_sound_inlinedPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_sound_inlinedPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_sound_inlinedPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_sound_inlinedPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_sound_inlinedPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_sound_inlinedPointer() {
            this(1, true);
        }

        public ma_sound_inlinedPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_sound_inlined createStackElement(long ptr, boolean freeOnGC) {
            return new ma_sound_inlined(ptr, freeOnGC);
        }
    }
}
