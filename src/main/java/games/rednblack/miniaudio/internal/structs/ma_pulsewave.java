package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_waveform;
import games.rednblack.miniaudio.internal.structs.ma_pulsewave_config;

public final class ma_pulsewave extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(189).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_pulsewave(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_pulsewave(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_pulsewave() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_pulsewave.ma_pulsewavePointer asPointer() {
        return new ma_pulsewave.ma_pulsewavePointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_pulsewave.ma_pulsewavePointer ptr) {
        ptr.setPointer(this);
    }

    public ma_waveform waveform() {
        return new ma_waveform(getPointer(), false);
    }

    public void waveform(ma_waveform toSetPtr) {
        toSetPtr.setPointer(getPointer(), (CHandler.IS_COMPILED_ANDROID_X86) ? 100 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 120 : 104, this);
    }

    public ma_waveform getWaveform() {
        return new ma_waveform(getBufPtr().duplicate(0, (CHandler.IS_COMPILED_ANDROID_X86) ? 100 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 120 : 104), true);
    }

    public void getWaveform(ma_waveform toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, (CHandler.IS_COMPILED_ANDROID_X86) ? 100 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 120 : 104);
    }

    public void setWaveform(ma_waveform toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, (CHandler.IS_COMPILED_ANDROID_X86) ? 100 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 120 : 104);
    }

    public ma_pulsewave_config config() {
        return new ma_pulsewave_config(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 100 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 120 : 104), false);
    }

    public void config(ma_pulsewave_config toSetPtr) {
        toSetPtr.setPointer(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 100 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 120 : 104), CHandler.IS_COMPILED_ANDROID_X86 ? 36 : 40, this);
    }

    public ma_pulsewave_config getConfig() {
        return new ma_pulsewave_config(getBufPtr().duplicate((CHandler.IS_COMPILED_ANDROID_X86) ? 100 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 120 : 104, CHandler.IS_COMPILED_ANDROID_X86 ? 36 : 40), true);
    }

    public void getConfig(ma_pulsewave_config toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), (CHandler.IS_COMPILED_ANDROID_X86) ? 100 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 120 : 104, CHandler.IS_COMPILED_ANDROID_X86 ? 36 : 40);
    }

    public void setConfig(ma_pulsewave_config toCopyFrom) {
        getBufPtr().copyFrom((CHandler.IS_COMPILED_ANDROID_X86) ? 100 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 120 : 104, toCopyFrom.getBufPtr(), 0, CHandler.IS_COMPILED_ANDROID_X86 ? 36 : 40);
    }

    public static final class ma_pulsewavePointer extends StackElementPointer<ma_pulsewave> {

        public ma_pulsewavePointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_pulsewavePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_pulsewavePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_pulsewavePointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_pulsewavePointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_pulsewavePointer() {
            this(1, true);
        }

        public ma_pulsewavePointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_pulsewave createStackElement(long ptr, boolean freeOnGC) {
            return new ma_pulsewave(ptr, freeOnGC);
        }
    }
}
