package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;

public final class ma_device_job_thread extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(118).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_device_job_thread(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_device_job_thread(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_device_job_thread() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_device_job_thread.ma_device_job_threadPointer asPointer() {
        return new ma_device_job_thread.ma_device_job_threadPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_device_job_thread.ma_device_job_threadPointer ptr) {
        ptr.setPointer(this);
    }

    public static final class ma_device_job_threadPointer extends StackElementPointer<ma_device_job_thread> {

        public ma_device_job_threadPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_device_job_threadPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_device_job_threadPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_device_job_threadPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_device_job_threadPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_device_job_threadPointer() {
            this(1, true);
        }

        public ma_device_job_threadPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_device_job_thread createStackElement(long ptr, boolean freeOnGC) {
            return new ma_device_job_thread(ptr, freeOnGC);
        }
    }
}
