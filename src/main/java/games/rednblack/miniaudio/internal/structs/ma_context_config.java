package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_log;
import games.rednblack.miniaudio.internal.enums.ma_thread_priority;
import games.rednblack.miniaudio.internal.structs.ma_allocation_callbacks;
import games.rednblack.miniaudio.internal.structs.ma_context_config.dsound;
import games.rednblack.miniaudio.internal.structs.ma_context_config.alsa;
import games.rednblack.miniaudio.internal.structs.ma_context_config.pulse;
import games.rednblack.miniaudio.internal.structs.ma_context_config.coreaudio;
import games.rednblack.miniaudio.internal.structs.ma_context_config.jack;
import games.rednblack.miniaudio.internal.structs.ma_backend_callbacks;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.BytePointer;
import games.rednblack.miniaudio.internal.enums.ma_ios_session_category;

public final class ma_context_config extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(96).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_context_config(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_context_config(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_context_config() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_context_config.ma_context_configPointer asPointer() {
        return new ma_context_config.ma_context_configPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_context_config.ma_context_configPointer ptr) {
        ptr.setPointer(this);
    }

    public ma_log.ma_logPointer pLog() {
        return new ma_log.ma_logPointer(getBufPtr().getNativePointer(0), false);
    }

    public void pLog(ma_log.ma_logPointer pLog) {
        getBufPtr().setNativePointer(0, pLog.getPointer());
    }

    public ma_thread_priority threadPriority() {
        return ma_thread_priority.getByIndex((int) getBufPtr().getInt(CHandler.IS_64_BIT ? 8 : 4));
    }

    public void threadPriority(ma_thread_priority threadPriority) {
        getBufPtr().setInt(CHandler.IS_64_BIT ? 8 : 4, threadPriority.getIndex());
    }

    public long threadStackSize() {
        return getBufPtr().getNativeULong(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 16 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 12 : 8);
    }

    public void threadStackSize(long threadStackSize) {
        getBufPtr().setNativeULong(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 16 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 12 : 8, threadStackSize);
    }

    public VoidPointer pUserData() {
        return new VoidPointer(getBufPtr().getNativePointer(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 16 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 24 : 12), false);
    }

    public void pUserData(VoidPointer pUserData) {
        getBufPtr().setNativePointer(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 16 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 24 : 12, pUserData.getPointer());
    }

    public ma_allocation_callbacks allocationCallbacks() {
        return new ma_allocation_callbacks(getPointer() + (((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 32 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 24 : 16), false);
    }

    public void allocationCallbacks(ma_allocation_callbacks toSetPtr) {
        toSetPtr.setPointer(getPointer() + (((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 32 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 24 : 16), CHandler.IS_64_BIT ? 32 : 16, this);
    }

    public ma_allocation_callbacks getAllocationCallbacks() {
        return new ma_allocation_callbacks(getBufPtr().duplicate(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 32 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 24 : 16, CHandler.IS_64_BIT ? 32 : 16), true);
    }

    public void getAllocationCallbacks(ma_allocation_callbacks toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 32 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 24 : 16, CHandler.IS_64_BIT ? 32 : 16);
    }

    public void setAllocationCallbacks(ma_allocation_callbacks toCopyFrom) {
        getBufPtr().copyFrom(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 32 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 24 : 16, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 32 : 16);
    }

    public dsound dsound() {
        return new dsound(getPointer() + (((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 64 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 56 : 32), false);
    }

    public void dsound(dsound toSetPtr) {
        toSetPtr.setPointer(getPointer() + (((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 64 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 56 : 32), CHandler.IS_64_BIT ? 8 : 4, this);
    }

    public dsound getDsound() {
        return new dsound(getBufPtr().duplicate(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 64 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 56 : 32, CHandler.IS_64_BIT ? 8 : 4), true);
    }

    public void getDsound(dsound toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 64 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 56 : 32, CHandler.IS_64_BIT ? 8 : 4);
    }

    public void setDsound(dsound toCopyFrom) {
        getBufPtr().copyFrom(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 64 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 56 : 32, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 8 : 4);
    }

    public alsa alsa() {
        return new alsa(getPointer() + (((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 64 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 36), false);
    }

    public void alsa(alsa toSetPtr) {
        toSetPtr.setPointer(getPointer() + (((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 64 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 36), 4, this);
    }

    public alsa getAlsa() {
        return new alsa(getBufPtr().duplicate(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 64 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 36, 4), true);
    }

    public void getAlsa(alsa toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 64 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 36, 4);
    }

    public void setAlsa(alsa toCopyFrom) {
        getBufPtr().copyFrom(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 64 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 36, toCopyFrom.getBufPtr(), 0, 4);
    }

    public pulse pulse() {
        return new pulse(getPointer() + (((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 80 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 72 : 40), false);
    }

    public void pulse(pulse toSetPtr) {
        toSetPtr.setPointer(getPointer() + (((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 80 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 72 : 40), CHandler.IS_64_BIT ? 24 : 12, this);
    }

    public pulse getPulse() {
        return new pulse(getBufPtr().duplicate(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 80 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 72 : 40, CHandler.IS_64_BIT ? 24 : 12), true);
    }

    public void getPulse(pulse toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 80 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 72 : 40, CHandler.IS_64_BIT ? 24 : 12);
    }

    public void setPulse(pulse toCopyFrom) {
        getBufPtr().copyFrom(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 80 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 72 : 40, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 24 : 12);
    }

    public coreaudio coreaudio() {
        return new coreaudio(getPointer() + (((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 96 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 104 : 52), false);
    }

    public void coreaudio(coreaudio toSetPtr) {
        toSetPtr.setPointer(getPointer() + (((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 96 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 104 : 52), 16, this);
    }

    public coreaudio getCoreaudio() {
        return new coreaudio(getBufPtr().duplicate(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 96 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 104 : 52, 16), true);
    }

    public void getCoreaudio(coreaudio toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 96 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 104 : 52, 16);
    }

    public void setCoreaudio(coreaudio toCopyFrom) {
        getBufPtr().copyFrom(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 96 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 104 : 52, toCopyFrom.getBufPtr(), 0, 16);
    }

    public jack jack() {
        return new jack(getPointer() + (((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 112 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 120 : 68), false);
    }

    public void jack(jack toSetPtr) {
        toSetPtr.setPointer(getPointer() + (((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 112 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 120 : 68), CHandler.IS_64_BIT ? 16 : 8, this);
    }

    public jack getJack() {
        return new jack(getBufPtr().duplicate(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 112 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 120 : 68, CHandler.IS_64_BIT ? 16 : 8), true);
    }

    public void getJack(jack toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 112 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 120 : 68, CHandler.IS_64_BIT ? 16 : 8);
    }

    public void setJack(jack toCopyFrom) {
        getBufPtr().copyFrom(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 112 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 120 : 68, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 16 : 8);
    }

    public ma_backend_callbacks custom() {
        return new ma_backend_callbacks(getPointer() + (((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 128 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 136 : 76), false);
    }

    public void custom(ma_backend_callbacks toSetPtr) {
        toSetPtr.setPointer(getPointer() + (((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 128 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 136 : 76), CHandler.IS_64_BIT ? 104 : 52, this);
    }

    public ma_backend_callbacks getCustom() {
        return new ma_backend_callbacks(getBufPtr().duplicate(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 128 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 136 : 76, CHandler.IS_64_BIT ? 104 : 52), true);
    }

    public void getCustom(ma_backend_callbacks toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 128 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 136 : 76, CHandler.IS_64_BIT ? 104 : 52);
    }

    public void setCustom(ma_backend_callbacks toCopyFrom) {
        getBufPtr().copyFrom(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 128 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 136 : 76, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 104 : 52);
    }

    public static final class ma_context_configPointer extends StackElementPointer<ma_context_config> {

        public ma_context_configPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_context_configPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_context_configPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_context_configPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_context_configPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_context_configPointer() {
            this(1, true);
        }

        public ma_context_configPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_context_config createStackElement(long ptr, boolean freeOnGC) {
            return new ma_context_config(ptr, freeOnGC);
        }
    }

    public final static class dsound extends Struct {

        private final static int __size;

        private final static long __ffi_type;

        static {
            __ffi_type = FFITypes.getCTypeInfo(56).getFfiType();
            __size = CHandler.getSizeFromFFIType(__ffi_type);
        }

        public dsound(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public dsound(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public dsound() {
            super(__size);
        }

        public long getSize() {
            return __size;
        }

        public long getFFIType() {
            return __ffi_type;
        }

        public dsound.dsoundPointer asPointer() {
            return new dsound.dsoundPointer(getPointer(), false, 1, this);
        }

        public void asPointer(dsound.dsoundPointer ptr) {
            ptr.setPointer(this);
        }

        public VoidPointer hWnd() {
            return new VoidPointer(getBufPtr().getNativePointer(0), false);
        }

        public void hWnd(VoidPointer hWnd) {
            getBufPtr().setNativePointer(0, hWnd.getPointer());
        }

        public static final class dsoundPointer extends StackElementPointer<dsound> {

            public dsoundPointer(VoidPointer pointer) {
                super(pointer);
            }

            public dsoundPointer(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public dsoundPointer(long pointer, boolean freeOnGC, int capacity) {
                super(pointer, freeOnGC, capacity * __size);
            }

            public dsoundPointer(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public dsoundPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                super(pointer, freeOnGC, capacity * __size);
                setParent(parent);
            }

            public dsoundPointer() {
                this(1, true);
            }

            public dsoundPointer(int count, boolean freeOnGC) {
                super(__size, count, freeOnGC);
            }

            public int getSize() {
                return __size;
            }

            protected dsound createStackElement(long ptr, boolean freeOnGC) {
                return new dsound(ptr, freeOnGC);
            }
        }
    }

    public final static class alsa extends Struct {

        private final static int __size;

        private final static long __ffi_type;

        static {
            __ffi_type = FFITypes.getCTypeInfo(34).getFfiType();
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

        public long useVerboseDeviceEnumeration() {
            return getBufPtr().getUInt(0);
        }

        public void useVerboseDeviceEnumeration(long useVerboseDeviceEnumeration) {
            getBufPtr().setUInt(0, useVerboseDeviceEnumeration);
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
            __ffi_type = FFITypes.getCTypeInfo(235).getFfiType();
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

        public BytePointer pApplicationName() {
            return new BytePointer(getBufPtr().getNativePointer(0), false);
        }

        public void pApplicationName(BytePointer pApplicationName) {
            getBufPtr().setNativePointer(0, pApplicationName.getPointer());
        }

        public BytePointer pServerName() {
            return new BytePointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false);
        }

        public void pServerName(BytePointer pServerName) {
            getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pServerName.getPointer());
        }

        public long tryAutoSpawn() {
            return getBufPtr().getUInt(CHandler.IS_64_BIT ? 16 : 8);
        }

        public void tryAutoSpawn(long tryAutoSpawn) {
            getBufPtr().setUInt(CHandler.IS_64_BIT ? 16 : 8, tryAutoSpawn);
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
            __ffi_type = FFITypes.getCTypeInfo(43).getFfiType();
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

        public ma_ios_session_category sessionCategory() {
            return ma_ios_session_category.getByIndex((int) getBufPtr().getUInt(0));
        }

        public void sessionCategory(ma_ios_session_category sessionCategory) {
            getBufPtr().setUInt(0, sessionCategory.getIndex());
        }

        public long sessionCategoryOptions() {
            return getBufPtr().getUInt(4);
        }

        public void sessionCategoryOptions(long sessionCategoryOptions) {
            getBufPtr().setUInt(4, sessionCategoryOptions);
        }

        public long noAudioSessionActivate() {
            return getBufPtr().getUInt(8);
        }

        public void noAudioSessionActivate(long noAudioSessionActivate) {
            getBufPtr().setUInt(8, noAudioSessionActivate);
        }

        public long noAudioSessionDeactivate() {
            return getBufPtr().getUInt(12);
        }

        public void noAudioSessionDeactivate(long noAudioSessionDeactivate) {
            getBufPtr().setUInt(12, noAudioSessionDeactivate);
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

    public final static class jack extends Struct {

        private final static int __size;

        private final static long __ffi_type;

        static {
            __ffi_type = FFITypes.getCTypeInfo(63).getFfiType();
            __size = CHandler.getSizeFromFFIType(__ffi_type);
        }

        public jack(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public jack(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public jack() {
            super(__size);
        }

        public long getSize() {
            return __size;
        }

        public long getFFIType() {
            return __ffi_type;
        }

        public jack.jackPointer asPointer() {
            return new jack.jackPointer(getPointer(), false, 1, this);
        }

        public void asPointer(jack.jackPointer ptr) {
            ptr.setPointer(this);
        }

        public BytePointer pClientName() {
            return new BytePointer(getBufPtr().getNativePointer(0), false);
        }

        public void pClientName(BytePointer pClientName) {
            getBufPtr().setNativePointer(0, pClientName.getPointer());
        }

        public long tryStartServer() {
            return getBufPtr().getUInt(CHandler.IS_64_BIT ? 8 : 4);
        }

        public void tryStartServer(long tryStartServer) {
            getBufPtr().setUInt(CHandler.IS_64_BIT ? 8 : 4, tryStartServer);
        }

        public static final class jackPointer extends StackElementPointer<jack> {

            public jackPointer(VoidPointer pointer) {
                super(pointer);
            }

            public jackPointer(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public jackPointer(long pointer, boolean freeOnGC, int capacity) {
                super(pointer, freeOnGC, capacity * __size);
            }

            public jackPointer(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public jackPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                super(pointer, freeOnGC, capacity * __size);
                setParent(parent);
            }

            public jackPointer() {
                this(1, true);
            }

            public jackPointer(int count, boolean freeOnGC) {
                super(__size, count, freeOnGC);
            }

            public int getSize() {
                return __size;
            }

            protected jack createStackElement(long ptr, boolean freeOnGC) {
                return new jack(ptr, freeOnGC);
            }
        }
    }
}
