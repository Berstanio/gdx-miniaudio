package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import com.badlogic.gdx.jnigen.runtime.closure.ClosureObject;
import games.rednblack.miniaudio.internal.structs.ma_data_source_vtable;
import games.rednblack.miniaudio.internal.GdxMiniaudio_Internal.ma_data_source_vtable_Internal;
import com.badlogic.gdx.jnigen.runtime.closure.Closure;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.UInt64Pointer;
import games.rednblack.miniaudio.internal.enums.ma_result;
import games.rednblack.miniaudio.internal.enums.ma_format;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.UIntPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.UBytePointer;

public final class ma_data_source_vtable extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(103).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_data_source_vtable(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_data_source_vtable(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_data_source_vtable() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_data_source_vtable.ma_data_source_vtablePointer asPointer() {
        return new ma_data_source_vtable.ma_data_source_vtablePointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_data_source_vtable.ma_data_source_vtablePointer ptr) {
        ptr.setPointer(this);
    }

    public ClosureObject<ma_data_source_vtable.onRead> onRead() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(0), ma_data_source_vtable_Internal.onRead_Internal::onRead_downcall);
    }

    public void onRead(ClosureObject<ma_data_source_vtable.onRead> onRead) {
        getBufPtr().setNativePointer(0, onRead.getPointer());
    }

    public ClosureObject<ma_data_source_vtable.onSeek> onSeek() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 8 : 4), ma_data_source_vtable_Internal.onSeek_Internal::onSeek_downcall);
    }

    public void onSeek(ClosureObject<ma_data_source_vtable.onSeek> onSeek) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 8 : 4, onSeek.getPointer());
    }

    public ClosureObject<ma_data_source_vtable.onGetDataFormat> onGetDataFormat() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 16 : 8), ma_data_source_vtable_Internal.onGetDataFormat_Internal::onGetDataFormat_downcall);
    }

    public void onGetDataFormat(ClosureObject<ma_data_source_vtable.onGetDataFormat> onGetDataFormat) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 16 : 8, onGetDataFormat.getPointer());
    }

    public ClosureObject<ma_data_source_vtable.onGetCursor> onGetCursor() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 24 : 12), ma_data_source_vtable_Internal.onGetCursor_Internal::onGetCursor_downcall);
    }

    public void onGetCursor(ClosureObject<ma_data_source_vtable.onGetCursor> onGetCursor) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 24 : 12, onGetCursor.getPointer());
    }

    public ClosureObject<ma_data_source_vtable.onGetLength> onGetLength() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 32 : 16), ma_data_source_vtable_Internal.onGetLength_Internal::onGetLength_downcall);
    }

    public void onGetLength(ClosureObject<ma_data_source_vtable.onGetLength> onGetLength) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 32 : 16, onGetLength.getPointer());
    }

    public ClosureObject<ma_data_source_vtable.onSetLooping> onSetLooping() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 40 : 20), ma_data_source_vtable_Internal.onSetLooping_Internal::onSetLooping_downcall);
    }

    public void onSetLooping(ClosureObject<ma_data_source_vtable.onSetLooping> onSetLooping) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 40 : 20, onSetLooping.getPointer());
    }

    public long flags() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 48 : 24);
    }

    public void flags(long flags) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 48 : 24, flags);
    }

    public static final class ma_data_source_vtablePointer extends StackElementPointer<ma_data_source_vtable> {

        public ma_data_source_vtablePointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_data_source_vtablePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_data_source_vtablePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_data_source_vtablePointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_data_source_vtablePointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_data_source_vtablePointer() {
            this(1, true);
        }

        public ma_data_source_vtablePointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_data_source_vtable createStackElement(long ptr, boolean freeOnGC) {
            return new ma_data_source_vtable(ptr, freeOnGC);
        }
    }

    public interface onRead extends Closure, ma_data_source_vtable_Internal.onRead_Internal {

        ma_result onRead_call(VoidPointer pDataSource, VoidPointer pFramesOut, long frameCount, UInt64Pointer pFramesRead);
    }

    public interface onSeek extends Closure, ma_data_source_vtable_Internal.onSeek_Internal {

        ma_result onSeek_call(VoidPointer pDataSource, long frameIndex);
    }

    public interface onGetDataFormat extends Closure, ma_data_source_vtable_Internal.onGetDataFormat_Internal {

        ma_result onGetDataFormat_call(VoidPointer pDataSource, ma_format.ma_formatPointer pFormat, UIntPointer pChannels, UIntPointer pSampleRate, UBytePointer pChannelMap, long channelMapCap);
    }

    public interface onGetCursor extends Closure, ma_data_source_vtable_Internal.onGetCursor_Internal {

        ma_result onGetCursor_call(VoidPointer pDataSource, UInt64Pointer pCursor);
    }

    public interface onGetLength extends Closure, ma_data_source_vtable_Internal.onGetLength_Internal {

        ma_result onGetLength_call(VoidPointer pDataSource, UInt64Pointer pLength);
    }

    public interface onSetLooping extends Closure, ma_data_source_vtable_Internal.onSetLooping_Internal {

        ma_result onSetLooping_call(VoidPointer pDataSource, long isLooping);
    }
}
