package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_resource_manager_pipeline_stage_notification;

public final class ma_resource_manager_pipeline_notifications extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(203).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_resource_manager_pipeline_notifications(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_resource_manager_pipeline_notifications(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_resource_manager_pipeline_notifications() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_resource_manager_pipeline_notifications.ma_resource_manager_pipeline_notificationsPointer asPointer() {
        return new ma_resource_manager_pipeline_notifications.ma_resource_manager_pipeline_notificationsPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_resource_manager_pipeline_notifications.ma_resource_manager_pipeline_notificationsPointer ptr) {
        ptr.setPointer(this);
    }

    public ma_resource_manager_pipeline_stage_notification init() {
        return new ma_resource_manager_pipeline_stage_notification(getPointer(), false);
    }

    public void init(ma_resource_manager_pipeline_stage_notification toSetPtr) {
        toSetPtr.setPointer(getPointer(), CHandler.IS_64_BIT ? 16 : 8, this);
    }

    public ma_resource_manager_pipeline_stage_notification getInit() {
        return new ma_resource_manager_pipeline_stage_notification(getBufPtr().duplicate(0, CHandler.IS_64_BIT ? 16 : 8), true);
    }

    public void getInit(ma_resource_manager_pipeline_stage_notification toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, CHandler.IS_64_BIT ? 16 : 8);
    }

    public void setInit(ma_resource_manager_pipeline_stage_notification toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 16 : 8);
    }

    public ma_resource_manager_pipeline_stage_notification done() {
        return new ma_resource_manager_pipeline_stage_notification(getPointer() + (CHandler.IS_64_BIT ? 16 : 8), false);
    }

    public void done(ma_resource_manager_pipeline_stage_notification toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 16 : 8), CHandler.IS_64_BIT ? 16 : 8, this);
    }

    public ma_resource_manager_pipeline_stage_notification getDone() {
        return new ma_resource_manager_pipeline_stage_notification(getBufPtr().duplicate(CHandler.IS_64_BIT ? 16 : 8, CHandler.IS_64_BIT ? 16 : 8), true);
    }

    public void getDone(ma_resource_manager_pipeline_stage_notification toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 16 : 8, CHandler.IS_64_BIT ? 16 : 8);
    }

    public void setDone(ma_resource_manager_pipeline_stage_notification toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_64_BIT ? 16 : 8, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 16 : 8);
    }

    public static final class ma_resource_manager_pipeline_notificationsPointer extends StackElementPointer<ma_resource_manager_pipeline_notifications> {

        public ma_resource_manager_pipeline_notificationsPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_resource_manager_pipeline_notificationsPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_resource_manager_pipeline_notificationsPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_resource_manager_pipeline_notificationsPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_resource_manager_pipeline_notificationsPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_resource_manager_pipeline_notificationsPointer() {
            this(1, true);
        }

        public ma_resource_manager_pipeline_notificationsPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_resource_manager_pipeline_notifications createStackElement(long ptr, boolean freeOnGC) {
            return new ma_resource_manager_pipeline_notifications(ptr, freeOnGC);
        }
    }
}
