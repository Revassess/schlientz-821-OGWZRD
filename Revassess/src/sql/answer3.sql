select app_user.user_id,app_user.username,app_user.password,app_user.first_name,app_user.last_name,app_user.role_id,study_set.owner_id, study_set.name,study_set.study_set_id
 from app_user
 inner join study_set on app_user.user_id=study_set.owner_id
 where  user_id =5; 