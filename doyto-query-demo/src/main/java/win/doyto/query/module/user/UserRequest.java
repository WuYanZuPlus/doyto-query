package win.doyto.query.module.user;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;
import win.doyto.query.entity.EntityRequest;

/**
 * UserRequest
 *
 * @author f0rb
 */
@Getter
@Setter
public class UserRequest implements EntityRequest<UserEntity> {

    private Long id;
    private String username;
    private String password;
    private String mobile;
    private String email;
    private String nickname;
    private boolean valid = true;
    private UserLevel userLevel;

    public UserEntity toEntity() {
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(this, userEntity);
        return userEntity;
    }
}
