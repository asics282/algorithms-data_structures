package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * Cloud
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-08-18T09:19:12.580010338Z[GMT]")



public class Cloud   {
  private String cloudId = null;

  private String idClient = null;

  /**
   * Операционная система сервера
   */
  public enum OSEnum {
    WINDOWS("Windows"),
    LINUX("Linux");

    private String value;

    OSEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OSEnum fromValue(String value) {
      for (OSEnum b : OSEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

  }
  private OSEnum OS = null;

  private String RAM = null;

  private String CPU = null;

  public Cloud cloudId(String cloudId) {
    this.cloudId = cloudId;
    return this;
  }

  /**
   * Get cloudId
   * @return cloudId
   **/
    public String getCloudId() {
    return cloudId;
  }

  public void setCloudId(String cloudId) {
    this.cloudId = cloudId;
  }

  public Cloud idClient(String idClient) {
    this.idClient = idClient;
    return this;
  }

  /**
   * Get idClient
   * @return idClient
   **/
    public String getIdClient() {
    return idClient;
  }

  public void setIdClient(String idClient) {
    this.idClient = idClient;
  }

  public Cloud OS(OSEnum OS) {
    this.OS = OS;
    return this;
  }

  /**
   * Операционная система сервера
   * @return OS
   **/
    public OSEnum getOS() {
    return OS;
  }

  public void setOS(OSEnum OS) {
    this.OS = OS;
  }

  public Cloud RAM(String RAM) {
    this.RAM = RAM;
    return this;
  }

  /**
   * Количество оперативной памяти
   * @return RAM
   **/
    public String getRAM() {
    return RAM;
  }

  public void setRAM(String RAM) {
    this.RAM = RAM;
  }

  public Cloud CPU(String CPU) {
    this.CPU = CPU;
    return this;
  }

  /**
   * Количество ядер CPU
   * @return CPU
   **/
    public String getCPU() {
    return CPU;
  }

  public void setCPU(String CPU) {
    this.CPU = CPU;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cloud cloud = (Cloud) o;
    return Objects.equals(this.cloudId, cloud.cloudId) &&
        Objects.equals(this.idClient, cloud.idClient) &&
        Objects.equals(this.OS, cloud.OS) &&
        Objects.equals(this.RAM, cloud.RAM) &&
        Objects.equals(this.CPU, cloud.CPU);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudId, idClient, OS, RAM, CPU);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cloud {\n");
    
    sb.append("    cloudId: ").append(toIndentedString(cloudId)).append("\n");
    sb.append("    idClient: ").append(toIndentedString(idClient)).append("\n");
    sb.append("    OS: ").append(toIndentedString(OS)).append("\n");
    sb.append("    RAM: ").append(toIndentedString(RAM)).append("\n");
    sb.append("    CPU: ").append(toIndentedString(CPU)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
