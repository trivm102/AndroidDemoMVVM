package com.example.keys

import JWT

val PRIVATE_KEY = "LS0tLS1CRUdJTiBQUklWQVRFIEtFWS0tLS0tCk1JR0hBZ0VBTUJNR0J5cUdTTTQ5QWdFR0NDcUdTTTQ5QXdFSEJHMHdhd0lCQVFRZ2hGQ0RvWEt0MXkwM3JNWWcKeENsM1ZjdWdHeDBadEhOZ2dOWnppK0JLV04yaFJBTkNBQVRjQytUaGNYb29BUTg1VTZBckVwdm9ycSs4L0c1SAo5NmxqMy92dTlYcFRWNC90NlphaUF0d2tLQXVneGlETFJPR2ZuVXJ2NmhNR0gvWGJEMXlzVXVzegotLS0tLUVORCBQUklWQVRFIEtFWS0tLS0tCg=="
val CLIENT_ID = "1bba2eb7-6edb-4204-858d-67f1838c78c9"

class AppKeys {
     fun getToken(): String {
        val claim = HashMap<String,Any?>()
        claim.put("client_id", CLIENT_ID)
        claim.put("ts", System.currentTimeMillis()/1000)
        val jwt = JWT(claim)
        return jwt.sign(PRIVATE_KEY)
    }
}