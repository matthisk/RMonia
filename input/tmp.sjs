function() {
    class C {
      method() { return typeof C === "function"; }
    }
    var M = C.prototype.method;
    C = undefined;
    return C === undefined && M();
}

