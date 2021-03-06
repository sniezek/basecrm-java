package com.getbase.models;

import com.fasterxml.jackson.annotation.JsonView;
import com.getbase.serializer.Views;
import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;

public class User {

  protected @JsonView(Views.ReadOnly.class) Long id;
  protected @JsonView(Views.ReadOnly.class) Boolean confirmed;
  protected @JsonView(Views.ReadOnly.class) DateTime createdAt;
  protected @JsonView(Views.ReadOnly.class) String role;
  protected @JsonView(Views.ReadOnly.class) String status;
  protected @JsonView(Views.ReadOnly.class) DateTime updatedAt;
  protected @JsonView(Views.ReadWrite.class) String email;
  protected @JsonView(Views.ReadWrite.class) String name;
  protected @JsonView(Views.ReadOnly.class) DateTime deletedAt;
  protected @JsonView(Views.ReadOnly.class) Long reportsTo;
  protected @JsonView(Views.ReadOnly.class) String timezone;
  protected @JsonView(Views.ReadOnly.class) String phoneNumber;
  protected @JsonView(Views.ReadOnly.class) String teamName;
  protected @JsonView(Views.ReadOnly.class) Group group;
  protected @JsonView(Views.ReadOnly.class) List<Role> roles = new ArrayList<Role>();
  protected @JsonView(Views.ReadOnly.class) Boolean invited;

  public User() {
  }

  public Long getId() {
    return this.id;
  }

  public Boolean getConfirmed() {
    return this.confirmed;
  }

  public DateTime getCreatedAt() {
    return this.createdAt;
  }

  public String getRole() {
    return this.role;
  }

  public String getStatus() {
    return this.status;
  }

  public DateTime getUpdatedAt() {
    return this.updatedAt;
  }

  public String getEmail() {
    return this.email;
  }

  public String getName() {
    return this.name;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DateTime getDeletedAt() {
    return this.deletedAt;
  }

  public Long getReportsTo() {
    return this.reportsTo;
  }

  public String getTimezone() {
    return this.timezone;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public String getTeamName() {
    return teamName;
  }

  public Group getGroup() {
    return this.group;
  }

  public List<Role> getRoles() {
    return this.roles;
  }

  public Boolean isInvited() {
    return this.invited;
  }

  @Override
  public String toString() {
    return "User{" +
          "id=" + id +
          ", confirmed=" + confirmed +
          ", createdAt=" + createdAt +
          ", role='" + role + '\'' +
          ", status='" + status + '\'' +
          ", updatedAt=" + updatedAt +
          ", email='" + email + '\'' +
          ", name='" + name + '\'' +
          ", deletedAt='" + deletedAt + '\'' +
          ", reportsTo='" + reportsTo + '\'' +
          ", timezone='" + timezone + '\'' +
          ", phoneNumber='" + phoneNumber + '\'' +
          ", teamName='" + teamName + '\'' +
          ", group='" + group + '\'' +
          ", roles=" + roles +
          ", invited=" + invited +
          "}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    User user = (User) o;

    if (id != null ? !id.equals(user.id) : user.id != null) return false;
    if (confirmed != null ? !confirmed.equals(user.confirmed) : user.confirmed != null) return false;
    if (createdAt != null ? !createdAt.equals(user.createdAt) : user.createdAt != null) return false;
    if (role != null ? !role.equals(user.role) : user.role != null) return false;
    if (status != null ? !status.equals(user.status) : user.status != null) return false;
    if (updatedAt != null ? !updatedAt.equals(user.updatedAt) : user.updatedAt != null) return false;
    if (email != null ? !email.equals(user.email) : user.email != null) return false;
    if (name != null ? !name.equals(user.name) : user.name != null) return false;
    if (deletedAt != null ? !deletedAt.equals(user.deletedAt) : user.deletedAt != null) return false;
    if (reportsTo != null ? !reportsTo.equals(user.reportsTo) : user.reportsTo != null) return false;
    if (timezone != null ? !timezone.equals(user.timezone) : user.timezone != null) return false;
    if (phoneNumber != null ? !phoneNumber.equals(user.phoneNumber) : user.phoneNumber != null) return false;
    if (teamName != null ? !teamName.equals(user.teamName) : user.teamName != null) return false;
    if (group != null ? !group.equals(user.group) : user.group != null) return false;
    if (!roles.equals(user.roles)) return false;
    if (invited != null ? !invited.equals(user.invited) : user.invited != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (id != null ? id.hashCode() : 0);
    result = 31 * result + (confirmed != null ? confirmed.hashCode() : 0);
    result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
    result = 31 * result + (role != null ? role.hashCode() : 0);
    result = 31 * result + (status != null ? status.hashCode() : 0);
    result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
    result = 31 * result + (email != null ? email.hashCode() : 0);
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (deletedAt != null ? deletedAt.hashCode() : 0);
    result = 31 * result + (reportsTo != null ? reportsTo.hashCode() : 0);
    result = 31 * result + (timezone != null ? timezone.hashCode() : 0);
    result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
    result = 31 * result + (teamName != null ? teamName.hashCode() : 0);
    result = 31 * result + (group != null ? group.hashCode() : 0);
    result = 31 * result + roles.hashCode();
    result = 31 * result + (invited != null ? invited.hashCode() : 0);
    return result;
  }

  public static class Group {

    protected @JsonView(Views.ReadOnly.class) Long id;

    protected @JsonView(Views.ReadOnly.class) String name;

    public Group() {
    }

    public Long getId() {
      return this.id;
    }

    public String getName() {
      return this.name;
    }

    @Override
    public String toString() {
      return "Group{" +
              "id=" + id +
              ", name='" + name + '\'' +
              '}';
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      Group group = (Group) o;

      if (id != null ? !id.equals(group.id) : group.id != null) return false;
      if (name != null ? !name.equals(group.name) : group.name != null) return false;

      return true;
    }

    @Override
    public int hashCode() {
      int result = id != null ? id.hashCode() : 0;
      result = 31 * result + (id != null ? id.hashCode() : 0);
      result = 31 * result + (name != null ? name.hashCode() : 0);
      return result;
    }

  }

  public static class Role {

    protected @JsonView(Views.ReadOnly.class) Long id;

    protected @JsonView(Views.ReadOnly.class) String name;

    public Role() {
    }

    public Long getId() {
      return this.id;
    }

    public String getName() {
      return this.name;
    }

    @Override
    public String toString() {
      return "Role{" +
              "id=" + id +
              ", name='" + name + '\'' +
              '}';
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      Role role = (Role) o;

      if (id != null ? !id.equals(role.id) : role.id != null) return false;
      if (name != null ? !name.equals(role.name) : role.name != null) return false;

      return true;
    }

    @Override
    public int hashCode() {
      int result = id != null ? id.hashCode() : 0;
      result = 31 * result + (id != null ? id.hashCode() : 0);
      result = 31 * result + (name != null ? name.hashCode() : 0);
      return result;
    }

  }

}
