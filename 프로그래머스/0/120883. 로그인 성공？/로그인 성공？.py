def solution(id_pw, db):
    db_dict = dict(db)
    if id_pw[0] in db_dict:
        if db_dict[id_pw[0]]==id_pw[1]:
            return 'login'
        else:
            return 'wrong pw'
    return 'fail'

def solution2(id_pw, db):
    for db_id,db_pw in db:
        if db_id==id_pw[0]:
            if db_pw==id_pw[1]:
                return 'login'
            else:
                return 'wrong pw'
                
    return 'fail'