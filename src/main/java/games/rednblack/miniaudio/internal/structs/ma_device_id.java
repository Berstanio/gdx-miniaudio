package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Union;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.UShortPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.UBytePointer;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.BytePointer;
import games.rednblack.miniaudio.internal.structs.ma_device_id.custom;

public final class ma_device_id extends Union {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(116).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_device_id(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_device_id(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_device_id() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_device_id.ma_device_idPointer asPointer() {
        return new ma_device_id.ma_device_idPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_device_id.ma_device_idPointer ptr) {
        ptr.setPointer(this);
    }

    public UShortPointer wasapi() {
        return new UShortPointer(getPointer(), false, 64);
    }

    public void wasapi(UShortPointer toSetPtr) {
        toSetPtr.setPointer(getPointer(), 128, this);
    }

    public UShortPointer getWasapi() {
        return new UShortPointer(getBufPtr().duplicate(0, 128), false, 64);
    }

    public void getWasapi(UShortPointer toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 128);
    }

    public void setWasapi(UShortPointer toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 128);
    }

    public UBytePointer dsound() {
        return new UBytePointer(getPointer(), false, 16);
    }

    public void dsound(UBytePointer toSetPtr) {
        toSetPtr.setPointer(getPointer(), 16, this);
    }

    public UBytePointer getDsound() {
        return new UBytePointer(getBufPtr().duplicate(0, 16), false, 16);
    }

    public void getDsound(UBytePointer toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 16);
    }

    public void setDsound(UBytePointer toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 16);
    }

    public long winmm() {
        return getBufPtr().getUInt(0);
    }

    public void winmm(long winmm) {
        getBufPtr().setUInt(0, winmm);
    }

    public BytePointer alsa() {
        return new BytePointer(getPointer(), false, 256);
    }

    public void alsa(BytePointer toSetPtr) {
        toSetPtr.setPointer(getPointer(), 256, this);
    }

    public BytePointer getAlsa() {
        return new BytePointer(getBufPtr().duplicate(0, 256), false, 256);
    }

    public void getAlsa(BytePointer toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 256);
    }

    public void setAlsa(BytePointer toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 256);
    }

    public BytePointer pulse() {
        return new BytePointer(getPointer(), false, 256);
    }

    public void pulse(BytePointer toSetPtr) {
        toSetPtr.setPointer(getPointer(), 256, this);
    }

    public BytePointer getPulse() {
        return new BytePointer(getBufPtr().duplicate(0, 256), false, 256);
    }

    public void getPulse(BytePointer toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 256);
    }

    public void setPulse(BytePointer toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 256);
    }

    public int jack() {
        return getBufPtr().getInt(0);
    }

    public void jack(int jack) {
        getBufPtr().setInt(0, jack);
    }

    public BytePointer coreaudio() {
        return new BytePointer(getPointer(), false, 256);
    }

    public void coreaudio(BytePointer toSetPtr) {
        toSetPtr.setPointer(getPointer(), 256, this);
    }

    public BytePointer getCoreaudio() {
        return new BytePointer(getBufPtr().duplicate(0, 256), false, 256);
    }

    public void getCoreaudio(BytePointer toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 256);
    }

    public void setCoreaudio(BytePointer toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 256);
    }

    public BytePointer sndio() {
        return new BytePointer(getPointer(), false, 256);
    }

    public void sndio(BytePointer toSetPtr) {
        toSetPtr.setPointer(getPointer(), 256, this);
    }

    public BytePointer getSndio() {
        return new BytePointer(getBufPtr().duplicate(0, 256), false, 256);
    }

    public void getSndio(BytePointer toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 256);
    }

    public void setSndio(BytePointer toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 256);
    }

    public BytePointer audio4() {
        return new BytePointer(getPointer(), false, 256);
    }

    public void audio4(BytePointer toSetPtr) {
        toSetPtr.setPointer(getPointer(), 256, this);
    }

    public BytePointer getAudio4() {
        return new BytePointer(getBufPtr().duplicate(0, 256), false, 256);
    }

    public void getAudio4(BytePointer toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 256);
    }

    public void setAudio4(BytePointer toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 256);
    }

    public BytePointer oss() {
        return new BytePointer(getPointer(), false, 64);
    }

    public void oss(BytePointer toSetPtr) {
        toSetPtr.setPointer(getPointer(), 64, this);
    }

    public BytePointer getOss() {
        return new BytePointer(getBufPtr().duplicate(0, 64), false, 64);
    }

    public void getOss(BytePointer toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 64);
    }

    public void setOss(BytePointer toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 64);
    }

    public int aaudio() {
        return getBufPtr().getInt(0);
    }

    public void aaudio(int aaudio) {
        getBufPtr().setInt(0, aaudio);
    }

    public long opensl() {
        return getBufPtr().getUInt(0);
    }

    public void opensl(long opensl) {
        getBufPtr().setUInt(0, opensl);
    }

    public BytePointer webaudio() {
        return new BytePointer(getPointer(), false, 32);
    }

    public void webaudio(BytePointer toSetPtr) {
        toSetPtr.setPointer(getPointer(), 32, this);
    }

    public BytePointer getWebaudio() {
        return new BytePointer(getBufPtr().duplicate(0, 32), false, 32);
    }

    public void getWebaudio(BytePointer toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 32);
    }

    public void setWebaudio(BytePointer toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 32);
    }

    public custom custom() {
        return new custom(getPointer(), false);
    }

    public void custom(custom toSetPtr) {
        toSetPtr.setPointer(getPointer(), 256, this);
    }

    public custom getCustom() {
        return new custom(getBufPtr().duplicate(0, 256), true);
    }

    public void getCustom(custom toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 256);
    }

    public void setCustom(custom toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 256);
    }

    public int nullbackend() {
        return getBufPtr().getInt(0);
    }

    public void nullbackend(int nullbackend) {
        getBufPtr().setInt(0, nullbackend);
    }

    public static final class ma_device_idPointer extends StackElementPointer<ma_device_id> {

        public ma_device_idPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_device_idPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_device_idPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_device_idPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_device_idPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_device_idPointer() {
            this(1, true);
        }

        public ma_device_idPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_device_id createStackElement(long ptr, boolean freeOnGC) {
            return new ma_device_id(ptr, freeOnGC);
        }
    }

    public final static class custom extends Union {

        private final static int __size;

        private final static long __ffi_type;

        static {
            __ffi_type = FFITypes.getCTypeInfo(48).getFfiType();
            __size = CHandler.getSizeFromFFIType(__ffi_type);
        }

        public custom(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public custom(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public custom() {
            super(__size);
        }

        public long getSize() {
            return __size;
        }

        public long getFFIType() {
            return __ffi_type;
        }

        public custom.customPointer asPointer() {
            return new custom.customPointer(getPointer(), false, 1, this);
        }

        public void asPointer(custom.customPointer ptr) {
            ptr.setPointer(this);
        }

        public int i() {
            return getBufPtr().getInt(0);
        }

        public void i(int i) {
            getBufPtr().setInt(0, i);
        }

        public BytePointer s() {
            return new BytePointer(getPointer(), false, 256);
        }

        public void s(BytePointer toSetPtr) {
            toSetPtr.setPointer(getPointer(), 256, this);
        }

        public BytePointer getS() {
            return new BytePointer(getBufPtr().duplicate(0, 256), false, 256);
        }

        public void getS(BytePointer toCopyTo) {
            toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 256);
        }

        public void setS(BytePointer toCopyFrom) {
            getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 256);
        }

        public VoidPointer p() {
            return new VoidPointer(getBufPtr().getNativePointer(0), false);
        }

        public void p(VoidPointer p) {
            getBufPtr().setNativePointer(0, p.getPointer());
        }

        public static final class customPointer extends StackElementPointer<custom> {

            public customPointer(VoidPointer pointer) {
                super(pointer);
            }

            public customPointer(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public customPointer(long pointer, boolean freeOnGC, int capacity) {
                super(pointer, freeOnGC, capacity * __size);
            }

            public customPointer(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public customPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                super(pointer, freeOnGC, capacity * __size);
                setParent(parent);
            }

            public customPointer() {
                this(1, true);
            }

            public customPointer(int count, boolean freeOnGC) {
                super(__size, count, freeOnGC);
            }

            public int getSize() {
                return __size;
            }

            protected custom createStackElement(long ptr, boolean freeOnGC) {
                return new custom(ptr, freeOnGC);
            }
        }
    }
}
