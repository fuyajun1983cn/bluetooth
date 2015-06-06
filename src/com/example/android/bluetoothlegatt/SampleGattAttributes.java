/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.bluetoothlegatt;

import java.util.HashMap;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
public class SampleGattAttributes {
    private static HashMap<String, String> attributes = new HashMap();
    public static String HEART_RATE_MEASUREMENT = "00002a37-0000-1000-8000-00805f9b34fb";
    public static String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";

    static {
        // Heart Rate Service.
        attributes.put("0000180d-0000-1000-8000-00805f9b34fb", "Heart Rate Service");
        //Device Information Service
        attributes.put("0000180a-0000-1000-8000-00805f9b34fb", "Device Information Service");
        //Alert Notification Service
        attributes.put("0000180a-0000-1000-8000-00805f9b34fb", "Alert Notification Service");
        //Battery Service
        attributes.put("0000180f-0000-1000-8000-00805f9b34fb", "Battery Service");
        //Blood Pressure
        attributes.put("000018010-0000-1000-8000-00805f9b34fb", "Blood Pressure");
        //Body Composition
        attributes.put("0000181b-0000-1000-8000-00805f9b34fb", "Body Composition");
        //Bond Management
        attributes.put("0000181e-0000-1000-8000-00805f9b34fb", "Bond Management");
        //Continuous Glucose Monitoring
        attributes.put("0000181f-0000-1000-8000-00805f9b34fb", "Continuous Glucose Monitoring");
        //Current Time Service
        attributes.put("00001805-0000-1000-8000-00805f9b34fb", "Current Time Service");
        //Cycling Power
        attributes.put("00001818-0000-1000-8000-00805f9b34fb", "Cycling Power");
        //Cycling Speed and Cadence
        attributes.put("00001816-0000-1000-8000-00805f9b34fb", "Cycling Speed and Cadence");
        //Device Information
        attributes.put("0000180a-0000-1000-8000-00805f9b34fb", "Device Information");
        //Environmental Sensing
        attributes.put("0000181a-0000-1000-8000-00805f9b34fb", "Environmental Sensing");
        //Generic Access
        attributes.put("00001800-0000-1000-8000-00805f9b34fb", "Generic Access");
        //Generic Attribute
        attributes.put("00001801-0000-1000-8000-00805f9b34fb", "Generic Attribute");
        //Glucose
        attributes.put("00001808-0000-1000-8000-00805f9b34fb", "Glucose");
        //Health Thermometer
        attributes.put("00001809-0000-1000-8000-00805f9b34fb", "Health Thermometer");
        //Heart Rate
        attributes.put("0000180d-0000-1000-8000-00805f9b34fb", "Heart Rate");
        //Human Interface Device
        attributes.put("00001812-0000-1000-8000-00805f9b34fb", "Human Interface Device");
        //Immediate Alert
        attributes.put("00001802-0000-1000-8000-00805f9b34fb", "Immediate Alert");
        //Indoor Positioning
        attributes.put("00001821-0000-1000-8000-00805f9b34fb", "Indoor Positioning");
        //Internet Protocol Support
        attributes.put("00001820-0000-1000-8000-00805f9b34fb", "Internet Protocol Support");
        //Link Loss
        attributes.put("00001803-0000-1000-8000-00805f9b34fb", "Link Loss");
        //Location and Navigation
        attributes.put("00001819-0000-1000-8000-00805f9b34fb", "Location and Navigation");
        //Next DST Change Service
        attributes.put("00001807-0000-1000-8000-00805f9b34fb", "Next DST Change Service");
        //Phone Alert Status Service
        attributes.put("0000180e-0000-1000-8000-00805f9b34fb", "Phone Alert Status Service");
        //Reference Time Update Service	
        attributes.put("00001806-0000-1000-8000-00805f9b34fb", "Reference Time Update Service");
        //Running Speed and Cadence
        attributes.put("00001814-0000-1000-8000-00805f9b34fb", "Running Speed and Cadence");
        //Location and Navigation
        attributes.put("00001819-0000-1000-8000-00805f9b34fb", "Location and Navigation");
       //Scan Parameters
        attributes.put("00001813-0000-1000-8000-00805f9b34fb", "Scan Parameters");
      //Tx Power
        attributes.put("00001804-0000-1000-8000-00805f9b34fb", "Tx Power");
      //User Data
        attributes.put("0000181c-0000-1000-8000-00805f9b34fb", "User Data");
      //Weight Scale
        attributes.put("0000181d-0000-1000-8000-00805f9b34fb", "Weight Scale");
    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}
