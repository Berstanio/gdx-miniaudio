package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_fence;

public final class ma_resource_manager_pipeline_stage_notification extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(204).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_resource_manager_pipeline_stage_notification(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_resource_manager_pipeline_stage_notification(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_resource_manager_pipeline_stage_notification() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_resource_manager_pipeline_stage_notification.ma_resource_manager_pipeline_stage_notificationPointer asPointer() {
        return new ma_resource_manager_pipeline_stage_notification.ma_resource_manager_pipeline_stage_notificationPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_resource_manager_pipeline_stage_notification.ma_resource_manager_pipeline_stage_notificationPointer ptr) {
        ptr.setPointer(this);
    }

    public VoidPointer pNotification() {
        return new VoidPointer(getBufPtr().getNativePointer(0), false);
    }

    public void pNotification(VoidPointer pNotification) {
        getBufPtr().setNativePointer(0, pNotification.getPointer());
    }

    public ma_fence.ma_fencePointer pFence() {
        return new ma_fence.ma_fencePointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false);
    }

    public void pFence(ma_fence.ma_fencePointer pFence) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pFence.getPointer());
    }

    public static final class ma_resource_manager_pipeline_stage_notificationPointer extends StackElementPointer<ma_resource_manager_pipeline_stage_notification> {

        public ma_resource_manager_pipeline_stage_notificationPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_resource_manager_pipeline_stage_notificationPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_resource_manager_pipeline_stage_notificationPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_resource_manager_pipeline_stage_notificationPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_resource_manager_pipeline_stage_notificationPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_resource_manager_pipeline_stage_notificationPointer() {
            this(1, true);
        }

        public ma_resource_manager_pipeline_stage_notificationPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_resource_manager_pipeline_stage_notification createStackElement(long ptr, boolean freeOnGC) {
            return new ma_resource_manager_pipeline_stage_notification(ptr, freeOnGC);
        }
    }
}
