package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_data_source_base;
import games.rednblack.miniaudio.internal.structs.ma_waveform_config;

public final class ma_waveform extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(222).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_waveform(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_waveform(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_waveform() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_waveform.ma_waveformPointer asPointer() {
        return new ma_waveform.ma_waveformPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_waveform.ma_waveformPointer ptr) {
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

    public ma_waveform_config config() {
        return new ma_waveform_config(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 56), false);
    }

    public void config(ma_waveform_config toSetPtr) {
        toSetPtr.setPointer(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 56), 32, this);
    }

    public ma_waveform_config getConfig() {
        return new ma_waveform_config(getBufPtr().duplicate((CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 56, 32), true);
    }

    public void getConfig(ma_waveform_config toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), (CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 56, 32);
    }

    public void setConfig(ma_waveform_config toCopyFrom) {
        getBufPtr().copyFrom((CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 56, toCopyFrom.getBufPtr(), 0, 32);
    }

    public double advance() {
        return getBufPtr().getDouble((CHandler.IS_COMPILED_ANDROID_X86) ? 84 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 104 : 88);
    }

    public void advance(double advance) {
        getBufPtr().setDouble((CHandler.IS_COMPILED_ANDROID_X86) ? 84 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 104 : 88, advance);
    }

    public double time() {
        return getBufPtr().getDouble((CHandler.IS_COMPILED_ANDROID_X86) ? 92 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 112 : 96);
    }

    public void time(double time) {
        getBufPtr().setDouble((CHandler.IS_COMPILED_ANDROID_X86) ? 92 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 112 : 96, time);
    }

    public static final class ma_waveformPointer extends StackElementPointer<ma_waveform> {

        public ma_waveformPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_waveformPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_waveformPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_waveformPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_waveformPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_waveformPointer() {
            this(1, true);
        }

        public ma_waveformPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_waveform createStackElement(long ptr, boolean freeOnGC) {
            return new ma_waveform(ptr, freeOnGC);
        }
    }
}
