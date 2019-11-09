package com.imain.dubbodemo.base;

import java.time.LocalDateTime;

/**
 * author Songrui.Liu
 * date 2019/11/619:25
 */
public class MonitorVO {
    private LocalDateTime timestamp;
    private String value;
    private Endpoint endpoint;

    public MonitorVO() {
    }

    public MonitorVO(LocalDateTime timestamp, String value, Endpoint endpoint) {
        this.timestamp = timestamp;
        this.value = value;
        this.endpoint = endpoint;
    }

    public MonitorVO(LocalDateTime timestamp, String value, String serviceName,
                     String ipv4) {
        this.timestamp = timestamp;
        this.value = value;
        this.endpoint = new Endpoint(serviceName, ipv4);
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public MonitorVO setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public String getValue() {
        return value;
    }

    public MonitorVO setValue(String value) {
        this.value = value;
        return this;
    }

    public Endpoint getEndpoint() {
        return endpoint;
    }

    public MonitorVO setEndpoint(Endpoint endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    static class Endpoint {
        private String serviceName;
        private String ipv4;

        public Endpoint() {
        }

        public Endpoint(String serviceName, String ipv4) {
            this.serviceName = serviceName;
            this.ipv4 = ipv4;
        }

        public String getServiceName() {
            return serviceName;
        }

        public Endpoint setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        public String getIpv4() {
            return ipv4;
        }

        public Endpoint setIpv4(String ipv4) {
            this.ipv4 = ipv4;
            return this;
        }

        @Override
        public String toString() {
            return "Endpoint{" +
                    "serviceName='" + serviceName + '\'' +
                    ", ipv4='" + ipv4 + '\'' +
                    '}';
        }
    }
}
