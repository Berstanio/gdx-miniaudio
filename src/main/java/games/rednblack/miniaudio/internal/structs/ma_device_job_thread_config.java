package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;

public final class ma_device_job_thread_config extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(119).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_device_job_thread_config(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_device_job_thread_config(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_device_job_thread_config() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_device_job_thread_config.ma_device_job_thread_configPointer asPointer() {
        return new ma_device_job_thread_config.ma_device_job_thread_configPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_device_job_thread_config.ma_device_job_thread_configPointer ptr) {
        ptr.setPointer(this);
    }

    public long noThread() {
        return getBufPtr().getUInt(0);
    }

    public void noThread(long noThread) {
        getBufPtr().setUInt(0, noThread);
    }

    public long jobQueueCapacity() {
        return getBufPtr().getUInt(4);
    }

    public void jobQueueCapacity(long jobQueueCapacity) {
        getBufPtr().setUInt(4, jobQueueCapacity);
    }

    public long jobQueueFlags() {
        return getBufPtr().getUInt(8);
    }

    public void jobQueueFlags(long jobQueueFlags) {
        getBufPtr().setUInt(8, jobQueueFlags);
    }

    public static final class ma_device_job_thread_configPointer extends StackElementPointer<ma_device_job_thread_config> {

        public ma_device_job_thread_configPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_device_job_thread_configPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_device_job_thread_configPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_device_job_thread_configPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_device_job_thread_configPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_device_job_thread_configPointer() {
            this(1, true);
        }

        public ma_device_job_thread_configPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_device_job_thread_config createStackElement(long ptr, boolean freeOnGC) {
            return new ma_device_job_thread_config(ptr, freeOnGC);
        }
    }
}
