package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_device;
import games.rednblack.miniaudio.internal.enums.ma_device_notification_type;
import games.rednblack.miniaudio.internal.structs.ma_device_notification.data;
import com.badlogic.gdx.jnigen.runtime.pointer.Union;
import games.rednblack.miniaudio.internal.structs.ma_device_notification.data.started;
import games.rednblack.miniaudio.internal.structs.ma_device_notification.data.stopped;
import games.rednblack.miniaudio.internal.structs.ma_device_notification.data.rerouted;
import games.rednblack.miniaudio.internal.structs.ma_device_notification.data.interruption;

public final class ma_device_notification extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(120).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_device_notification(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_device_notification(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_device_notification() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_device_notification.ma_device_notificationPointer asPointer() {
        return new ma_device_notification.ma_device_notificationPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_device_notification.ma_device_notificationPointer ptr) {
        ptr.setPointer(this);
    }

    public ma_device.ma_devicePointer pDevice() {
        return new ma_device.ma_devicePointer(getBufPtr().getNativePointer(0), false);
    }

    public void pDevice(ma_device.ma_devicePointer pDevice) {
        getBufPtr().setNativePointer(0, pDevice.getPointer());
    }

    public ma_device_notification_type type() {
        return ma_device_notification_type.getByIndex((int) getBufPtr().getUInt(CHandler.IS_64_BIT ? 8 : 4));
    }

    public void type(ma_device_notification_type type) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 8 : 4, type.getIndex());
    }

    public data data() {
        return new data(getPointer() + (CHandler.IS_64_BIT ? 12 : 8), false);
    }

    public void data(data toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 12 : 8), 4, this);
    }

    public data getData() {
        return new data(getBufPtr().duplicate(CHandler.IS_64_BIT ? 12 : 8, 4), true);
    }

    public void getData(data toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 12 : 8, 4);
    }

    public void setData(data toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_64_BIT ? 12 : 8, toCopyFrom.getBufPtr(), 0, 4);
    }

    public static final class ma_device_notificationPointer extends StackElementPointer<ma_device_notification> {

        public ma_device_notificationPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_device_notificationPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_device_notificationPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_device_notificationPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_device_notificationPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_device_notificationPointer() {
            this(1, true);
        }

        public ma_device_notificationPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_device_notification createStackElement(long ptr, boolean freeOnGC) {
            return new ma_device_notification(ptr, freeOnGC);
        }
    }

    public final static class data extends Union {

        private final static int __size;

        private final static long __ffi_type;

        static {
            __ffi_type = FFITypes.getCTypeInfo(50).getFfiType();
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

        public started started() {
            return new started(getPointer(), false);
        }

        public void started(started toSetPtr) {
            toSetPtr.setPointer(getPointer(), 4, this);
        }

        public started getStarted() {
            return new started(getBufPtr().duplicate(0, 4), true);
        }

        public void getStarted(started toCopyTo) {
            toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 4);
        }

        public void setStarted(started toCopyFrom) {
            getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 4);
        }

        public stopped stopped() {
            return new stopped(getPointer(), false);
        }

        public void stopped(stopped toSetPtr) {
            toSetPtr.setPointer(getPointer(), 4, this);
        }

        public stopped getStopped() {
            return new stopped(getBufPtr().duplicate(0, 4), true);
        }

        public void getStopped(stopped toCopyTo) {
            toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 4);
        }

        public void setStopped(stopped toCopyFrom) {
            getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 4);
        }

        public rerouted rerouted() {
            return new rerouted(getPointer(), false);
        }

        public void rerouted(rerouted toSetPtr) {
            toSetPtr.setPointer(getPointer(), 4, this);
        }

        public rerouted getRerouted() {
            return new rerouted(getBufPtr().duplicate(0, 4), true);
        }

        public void getRerouted(rerouted toCopyTo) {
            toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 4);
        }

        public void setRerouted(rerouted toCopyFrom) {
            getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 4);
        }

        public interruption interruption() {
            return new interruption(getPointer(), false);
        }

        public void interruption(interruption toSetPtr) {
            toSetPtr.setPointer(getPointer(), 4, this);
        }

        public interruption getInterruption() {
            return new interruption(getBufPtr().duplicate(0, 4), true);
        }

        public void getInterruption(interruption toCopyTo) {
            toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 4);
        }

        public void setInterruption(interruption toCopyFrom) {
            getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 4);
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

        public final static class started extends Struct {

            private final static int __size;

            private final static long __ffi_type;

            static {
                __ffi_type = FFITypes.getCTypeInfo(242).getFfiType();
                __size = CHandler.getSizeFromFFIType(__ffi_type);
            }

            public started(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public started(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public started() {
                super(__size);
            }

            public long getSize() {
                return __size;
            }

            public long getFFIType() {
                return __ffi_type;
            }

            public started.startedPointer asPointer() {
                return new started.startedPointer(getPointer(), false, 1, this);
            }

            public void asPointer(started.startedPointer ptr) {
                ptr.setPointer(this);
            }

            public int _unused() {
                return getBufPtr().getInt(0);
            }

            public void _unused(int _unused) {
                getBufPtr().setInt(0, _unused);
            }

            public static final class startedPointer extends StackElementPointer<started> {

                public startedPointer(VoidPointer pointer) {
                    super(pointer);
                }

                public startedPointer(long pointer, boolean freeOnGC) {
                    super(pointer, freeOnGC);
                }

                public startedPointer(long pointer, boolean freeOnGC, int capacity) {
                    super(pointer, freeOnGC, capacity * __size);
                }

                public startedPointer(long pointer, boolean freeOnGC, Pointing parent) {
                    super(pointer, freeOnGC);
                    setParent(parent);
                }

                public startedPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                    super(pointer, freeOnGC, capacity * __size);
                    setParent(parent);
                }

                public startedPointer() {
                    this(1, true);
                }

                public startedPointer(int count, boolean freeOnGC) {
                    super(__size, count, freeOnGC);
                }

                public int getSize() {
                    return __size;
                }

                protected started createStackElement(long ptr, boolean freeOnGC) {
                    return new started(ptr, freeOnGC);
                }
            }
        }

        public final static class stopped extends Struct {

            private final static int __size;

            private final static long __ffi_type;

            static {
                __ffi_type = FFITypes.getCTypeInfo(245).getFfiType();
                __size = CHandler.getSizeFromFFIType(__ffi_type);
            }

            public stopped(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public stopped(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public stopped() {
                super(__size);
            }

            public long getSize() {
                return __size;
            }

            public long getFFIType() {
                return __ffi_type;
            }

            public stopped.stoppedPointer asPointer() {
                return new stopped.stoppedPointer(getPointer(), false, 1, this);
            }

            public void asPointer(stopped.stoppedPointer ptr) {
                ptr.setPointer(this);
            }

            public int _unused() {
                return getBufPtr().getInt(0);
            }

            public void _unused(int _unused) {
                getBufPtr().setInt(0, _unused);
            }

            public static final class stoppedPointer extends StackElementPointer<stopped> {

                public stoppedPointer(VoidPointer pointer) {
                    super(pointer);
                }

                public stoppedPointer(long pointer, boolean freeOnGC) {
                    super(pointer, freeOnGC);
                }

                public stoppedPointer(long pointer, boolean freeOnGC, int capacity) {
                    super(pointer, freeOnGC, capacity * __size);
                }

                public stoppedPointer(long pointer, boolean freeOnGC, Pointing parent) {
                    super(pointer, freeOnGC);
                    setParent(parent);
                }

                public stoppedPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                    super(pointer, freeOnGC, capacity * __size);
                    setParent(parent);
                }

                public stoppedPointer() {
                    this(1, true);
                }

                public stoppedPointer(int count, boolean freeOnGC) {
                    super(__size, count, freeOnGC);
                }

                public int getSize() {
                    return __size;
                }

                protected stopped createStackElement(long ptr, boolean freeOnGC) {
                    return new stopped(ptr, freeOnGC);
                }
            }
        }

        public final static class rerouted extends Struct {

            private final static int __size;

            private final static long __ffi_type;

            static {
                __ffi_type = FFITypes.getCTypeInfo(238).getFfiType();
                __size = CHandler.getSizeFromFFIType(__ffi_type);
            }

            public rerouted(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public rerouted(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public rerouted() {
                super(__size);
            }

            public long getSize() {
                return __size;
            }

            public long getFFIType() {
                return __ffi_type;
            }

            public rerouted.reroutedPointer asPointer() {
                return new rerouted.reroutedPointer(getPointer(), false, 1, this);
            }

            public void asPointer(rerouted.reroutedPointer ptr) {
                ptr.setPointer(this);
            }

            public int _unused() {
                return getBufPtr().getInt(0);
            }

            public void _unused(int _unused) {
                getBufPtr().setInt(0, _unused);
            }

            public static final class reroutedPointer extends StackElementPointer<rerouted> {

                public reroutedPointer(VoidPointer pointer) {
                    super(pointer);
                }

                public reroutedPointer(long pointer, boolean freeOnGC) {
                    super(pointer, freeOnGC);
                }

                public reroutedPointer(long pointer, boolean freeOnGC, int capacity) {
                    super(pointer, freeOnGC, capacity * __size);
                }

                public reroutedPointer(long pointer, boolean freeOnGC, Pointing parent) {
                    super(pointer, freeOnGC);
                    setParent(parent);
                }

                public reroutedPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                    super(pointer, freeOnGC, capacity * __size);
                    setParent(parent);
                }

                public reroutedPointer() {
                    this(1, true);
                }

                public reroutedPointer(int count, boolean freeOnGC) {
                    super(__size, count, freeOnGC);
                }

                public int getSize() {
                    return __size;
                }

                protected rerouted createStackElement(long ptr, boolean freeOnGC) {
                    return new rerouted(ptr, freeOnGC);
                }
            }
        }

        public final static class interruption extends Struct {

            private final static int __size;

            private final static long __ffi_type;

            static {
                __ffi_type = FFITypes.getCTypeInfo(62).getFfiType();
                __size = CHandler.getSizeFromFFIType(__ffi_type);
            }

            public interruption(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public interruption(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public interruption() {
                super(__size);
            }

            public long getSize() {
                return __size;
            }

            public long getFFIType() {
                return __ffi_type;
            }

            public interruption.interruptionPointer asPointer() {
                return new interruption.interruptionPointer(getPointer(), false, 1, this);
            }

            public void asPointer(interruption.interruptionPointer ptr) {
                ptr.setPointer(this);
            }

            public int _unused() {
                return getBufPtr().getInt(0);
            }

            public void _unused(int _unused) {
                getBufPtr().setInt(0, _unused);
            }

            public static final class interruptionPointer extends StackElementPointer<interruption> {

                public interruptionPointer(VoidPointer pointer) {
                    super(pointer);
                }

                public interruptionPointer(long pointer, boolean freeOnGC) {
                    super(pointer, freeOnGC);
                }

                public interruptionPointer(long pointer, boolean freeOnGC, int capacity) {
                    super(pointer, freeOnGC, capacity * __size);
                }

                public interruptionPointer(long pointer, boolean freeOnGC, Pointing parent) {
                    super(pointer, freeOnGC);
                    setParent(parent);
                }

                public interruptionPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                    super(pointer, freeOnGC, capacity * __size);
                    setParent(parent);
                }

                public interruptionPointer() {
                    this(1, true);
                }

                public interruptionPointer(int count, boolean freeOnGC) {
                    super(__size, count, freeOnGC);
                }

                public int getSize() {
                    return __size;
                }

                protected interruption createStackElement(long ptr, boolean freeOnGC) {
                    return new interruption(ptr, freeOnGC);
                }
            }
        }
    }
}
