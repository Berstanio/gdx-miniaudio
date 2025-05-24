package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_node_graph;
import games.rednblack.miniaudio.internal.structs.ma_node_vtable;
import games.rednblack.miniaudio.internal.structs.ma_node_input_bus;
import games.rednblack.miniaudio.internal.structs.ma_node_output_bus;
import com.badlogic.gdx.jnigen.runtime.pointer.FloatPointer;
import games.rednblack.miniaudio.internal.enums.ma_node_state;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.UInt64Pointer;

public final class ma_node_base extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(165).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_node_base(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_node_base(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_node_base() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_node_base.ma_node_basePointer asPointer() {
        return new ma_node_base.ma_node_basePointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_node_base.ma_node_basePointer ptr) {
        ptr.setPointer(this);
    }

    public ma_node_graph.ma_node_graphPointer pNodeGraph() {
        return new ma_node_graph.ma_node_graphPointer(getBufPtr().getNativePointer(0), false);
    }

    public void pNodeGraph(ma_node_graph.ma_node_graphPointer pNodeGraph) {
        getBufPtr().setNativePointer(0, pNodeGraph.getPointer());
    }

    public ma_node_vtable.ma_node_vtablePointer vtable() {
        return new ma_node_vtable.ma_node_vtablePointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false);
    }

    public void vtable(ma_node_vtable.ma_node_vtablePointer vtable) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 8 : 4, vtable.getPointer());
    }

    public long inputBusCount() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 16 : 8);
    }

    public void inputBusCount(long inputBusCount) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 16 : 8, inputBusCount);
    }

    public long outputBusCount() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 20 : 12);
    }

    public void outputBusCount(long outputBusCount) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 20 : 12, outputBusCount);
    }

    public ma_node_input_bus.ma_node_input_busPointer pInputBuses() {
        return new ma_node_input_bus.ma_node_input_busPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 24 : 16), false);
    }

    public void pInputBuses(ma_node_input_bus.ma_node_input_busPointer pInputBuses) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 24 : 16, pInputBuses.getPointer());
    }

    public ma_node_output_bus.ma_node_output_busPointer pOutputBuses() {
        return new ma_node_output_bus.ma_node_output_busPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 32 : 20), false);
    }

    public void pOutputBuses(ma_node_output_bus.ma_node_output_busPointer pOutputBuses) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 32 : 20, pOutputBuses.getPointer());
    }

    public FloatPointer pCachedData() {
        return new FloatPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 40 : 24), false);
    }

    public void pCachedData(FloatPointer pCachedData) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 40 : 24, pCachedData.getPointer());
    }

    public char cachedDataCapInFramesPerBus() {
        return getBufPtr().getChar(CHandler.IS_64_BIT ? 48 : 28);
    }

    public void cachedDataCapInFramesPerBus(char cachedDataCapInFramesPerBus) {
        getBufPtr().setChar(CHandler.IS_64_BIT ? 48 : 28, cachedDataCapInFramesPerBus);
    }

    public char cachedFrameCountOut() {
        return getBufPtr().getChar(CHandler.IS_64_BIT ? 50 : 30);
    }

    public void cachedFrameCountOut(char cachedFrameCountOut) {
        getBufPtr().setChar(CHandler.IS_64_BIT ? 50 : 30, cachedFrameCountOut);
    }

    public char cachedFrameCountIn() {
        return getBufPtr().getChar(CHandler.IS_64_BIT ? 52 : 32);
    }

    public void cachedFrameCountIn(char cachedFrameCountIn) {
        getBufPtr().setChar(CHandler.IS_64_BIT ? 52 : 32, cachedFrameCountIn);
    }

    public char consumedFrameCountIn() {
        return getBufPtr().getChar(CHandler.IS_64_BIT ? 54 : 34);
    }

    public void consumedFrameCountIn(char consumedFrameCountIn) {
        getBufPtr().setChar(CHandler.IS_64_BIT ? 54 : 34, consumedFrameCountIn);
    }

    public ma_node_state state() {
        return ma_node_state.getByIndex((int) getBufPtr().getUInt(CHandler.IS_64_BIT ? 56 : 36));
    }

    public void state(ma_node_state state) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 56 : 36, state.getIndex());
    }

    public UInt64Pointer stateTimes() {
        return new UInt64Pointer(getPointer() + (CHandler.IS_64_BIT ? 64 : 40), false, 2);
    }

    public void stateTimes(UInt64Pointer toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 64 : 40), 16, this);
    }

    public UInt64Pointer getStateTimes() {
        return new UInt64Pointer(getBufPtr().duplicate(CHandler.IS_64_BIT ? 64 : 40, 16), false, 2);
    }

    public void getStateTimes(UInt64Pointer toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 64 : 40, 16);
    }

    public void setStateTimes(UInt64Pointer toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_64_BIT ? 64 : 40, toCopyFrom.getBufPtr(), 0, 16);
    }

    public long localTime() {
        return getBufPtr().getLong(CHandler.IS_64_BIT ? 80 : 56);
    }

    public void localTime(long localTime) {
        getBufPtr().setLong(CHandler.IS_64_BIT ? 80 : 56, localTime);
    }

    public ma_node_input_bus.ma_node_input_busPointer _inputBuses() {
        return new ma_node_input_bus.ma_node_input_busPointer(getPointer() + (CHandler.IS_64_BIT ? 88 : 64), false, 2);
    }

    public void _inputBuses(ma_node_input_bus.ma_node_input_busPointer toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 88 : 64), CHandler.IS_64_BIT ? 144 : 104, this);
    }

    public ma_node_input_bus.ma_node_input_busPointer get_inputBuses() {
        return new ma_node_input_bus.ma_node_input_busPointer(getBufPtr().duplicate(CHandler.IS_64_BIT ? 88 : 64, CHandler.IS_64_BIT ? 144 : 104), false, 2);
    }

    public void get_inputBuses(ma_node_input_bus.ma_node_input_busPointer toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 88 : 64, CHandler.IS_64_BIT ? 144 : 104);
    }

    public void set_inputBuses(ma_node_input_bus.ma_node_input_busPointer toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_64_BIT ? 88 : 64, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 144 : 104);
    }

    public ma_node_output_bus.ma_node_output_busPointer _outputBuses() {
        return new ma_node_output_bus.ma_node_output_busPointer(getPointer() + (CHandler.IS_64_BIT ? 232 : 168), false, 2);
    }

    public void _outputBuses(ma_node_output_bus.ma_node_output_busPointer toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 232 : 168), CHandler.IS_64_BIT ? 112 : 80, this);
    }

    public ma_node_output_bus.ma_node_output_busPointer get_outputBuses() {
        return new ma_node_output_bus.ma_node_output_busPointer(getBufPtr().duplicate(CHandler.IS_64_BIT ? 232 : 168, CHandler.IS_64_BIT ? 112 : 80), false, 2);
    }

    public void get_outputBuses(ma_node_output_bus.ma_node_output_busPointer toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 232 : 168, CHandler.IS_64_BIT ? 112 : 80);
    }

    public void set_outputBuses(ma_node_output_bus.ma_node_output_busPointer toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_64_BIT ? 232 : 168, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 112 : 80);
    }

    public VoidPointer _pHeap() {
        return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 344 : 248), false);
    }

    public void _pHeap(VoidPointer _pHeap) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 344 : 248, _pHeap.getPointer());
    }

    public long _ownsHeap() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 352 : 252);
    }

    public void _ownsHeap(long _ownsHeap) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 352 : 252, _ownsHeap);
    }

    public static final class ma_node_basePointer extends StackElementPointer<ma_node_base> {

        public ma_node_basePointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_node_basePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_node_basePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_node_basePointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_node_basePointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_node_basePointer() {
            this(1, true);
        }

        public ma_node_basePointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_node_base createStackElement(long ptr, boolean freeOnGC) {
            return new ma_node_base(ptr, freeOnGC);
        }
    }
}
