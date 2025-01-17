// hook_function.js
Interceptor.attach(ptr("0x12345678"), {
    onEnter: function(args) {
        console.log("Function called with args: " + args[0].toInt32());
    },
    onLeave: function(retval) {
        console.log("Function returned with: " + retval.toInt32());
    }
});
