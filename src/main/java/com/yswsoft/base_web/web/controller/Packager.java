package com.yswsoft.base_web.web.controller;

import java.io.Serializable;
import java.lang.reflect.Array;

import com.alibaba.fastjson.JSONObject;

public class Packager implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String created_at;
	public Long id;
	public Long mid;
	public Long idstr;
	public String text;
	public String source;
	public String favorited;
	public String truncated;
	public String in_reply_to_status_id;
	public String in_reply_to_user_id;
	public String in_reply_to_screen_name;
	public Array pic_urls;
	public Geo geo;
	public User usr;
	
	public Annotations annotations;
	public int reposts_count;
	public int comments_count;
	public int attitudes_count;
	public int mlevel;
	public Visible visible;
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getMid() {
		return mid;
	}
	public void setMid(Long mid) {
		this.mid = mid;
	}
	public Long getIdstr() {
		return idstr;
	}
	public void setIdstr(Long idstr) {
		this.idstr = idstr;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getFavorited() {
		return favorited;
	}
	public void setFavorited(String favorited) {
		this.favorited = favorited;
	}
	public String getTruncated() {
		return truncated;
	}
	public void setTruncated(String truncated) {
		this.truncated = truncated;
	}
	public String getIn_reply_to_status_id() {
		return in_reply_to_status_id;
	}
	public void setIn_reply_to_status_id(String in_reply_to_status_id) {
		this.in_reply_to_status_id = in_reply_to_status_id;
	}
	public String getIn_reply_to_user_id() {
		return in_reply_to_user_id;
	}
	public void setIn_reply_to_user_id(String in_reply_to_user_id) {
		this.in_reply_to_user_id = in_reply_to_user_id;
	}
	public String getIn_reply_to_screen_name() {
		return in_reply_to_screen_name;
	}
	public void setIn_reply_to_screen_name(String in_reply_to_screen_name) {
		this.in_reply_to_screen_name = in_reply_to_screen_name;
	}
	
	
	/*public String getPic_urls() {
		return pic_urls;
	}
	public void setPic_urls(String pic_urls) {
		this.pic_urls = pic_urls;
	}
	public Geo getGeo() {
		return geo;
	}
	public void setGeo(Geo geo) {
		this.geo = geo;
	}*/
	public User getUsr() {
		return usr;
	}
	public void setUsr(User usr) {
		this.usr = usr;
	}
	
	public Array getPic_urls() {
		return pic_urls;
	}
	public void setPic_urls(Array pic_urls) {
		this.pic_urls = pic_urls;
	}
	
		public int getReposts_count() {
		return reposts_count;
	}
	public void setReposts_count(int reposts_count) {
		this.reposts_count = reposts_count;
	}
	public int getComments_count() {
		return comments_count;
	}
	public void setComments_count(int comments_count) {
		this.comments_count = comments_count;
	}
	public int getAttitudes_count() {
		return attitudes_count;
	}
	public void setAttitudes_count(int attitudes_count) {
		this.attitudes_count = attitudes_count;
	}
	public int getMlevel() {
		return mlevel;
	}
	public void setMlevel(int mlevel) {
		this.mlevel = mlevel;
	}
	public Visible getVisible() {
		return visible;
	}
	public void setVisible(Visible visible) {
		this.visible = visible;
	}
	public static Packager toBean(JSONObject jo, Class<Packager> class1) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}



class Annotations{
	public Place place;
	public String client_mblogid;
	public Place getPlace() {
		return place;
	}
	public void setPlace(Place place) {
		this.place = place;
	}
	public String getClient_mblogid() {
		return client_mblogid;
	}
	public void setClient_mblogid(String client_mblogid) {
		this.client_mblogid = client_mblogid;
	}
	
}

class Place{
	public String poiid;
	public double lon;
	public String title;
	public String type;
	public double lat;
	public String getPoiid() {
		return poiid;
	}
	public void setPoiid(String poiid) {
		this.poiid = poiid;
	}
	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	
}


class Geo {
	public String type;
	public String coordinates;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}
	
	
	
}

class Visible{
	public int type;
	public int list_id;
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getList_id() {
		return list_id;
	}
	public void setList_id(int list_id) {
		this.list_id = list_id;
	}
	
}

class User {
	public Long id;
	public Long idstr;
	public int clas;
	public String screen_name;
	public String name;
	public int province;
	public int city;
	public String location;
	public String description;
	public String url;
	public String profile_image_url;
	public String profile_url;
	public String domain;
	public String weihao;
	public String gender;
	public int followers_count;
	public int friends_count;
	public int statuses_count;
	public int favourites_count;
	public String created_at;
	public String following;
	public String allow_all_act_msg;
	public String geo_enabled;
	public String verified;
	public int verified_type;
	public String remark;
	public int ptype;
	public String allow_all_comment;
	public String avatar_large;
	public String avatar_hd;
	public String verified_reason;
	public String verified_trade;
	public String verified_reason_url;
	public String verified_source;
	public String verified_source_url;
	public String follow_me;
	public int online_status;
	public int bi_followers_count;
	public String lang;
	public int star;
	public int mbtype;
	public int mbrank;
	public int block_word;
	public int block_app;
	public int worldcup_guess;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getIdstr() {
		return idstr;
	}
	public void setIdstr(Long idstr) {
		this.idstr = idstr;
	}
	public int getClas() {
		return clas;
	}
	public void setClas(int clas) {
		this.clas = clas;
	}
	public String getScreen_name() {
		return screen_name;
	}
	public void setScreen_name(String screen_name) {
		this.screen_name = screen_name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getProvince() {
		return province;
	}
	public void setProvince(int province) {
		this.province = province;
	}
	public int getCity() {
		return city;
	}
	public void setCity(int city) {
		this.city = city;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getProfile_image_url() {
		return profile_image_url;
	}
	public void setProfile_image_url(String profile_image_url) {
		this.profile_image_url = profile_image_url;
	}
	public String getProfile_url() {
		return profile_url;
	}
	public void setProfile_url(String profile_url) {
		this.profile_url = profile_url;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getWeihao() {
		return weihao;
	}
	public void setWeihao(String weihao) {
		this.weihao = weihao;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getFollowers_count() {
		return followers_count;
	}
	public void setFollowers_count(int followers_count) {
		this.followers_count = followers_count;
	}
	public int getFriends_count() {
		return friends_count;
	}
	public void setFriends_count(int friends_count) {
		this.friends_count = friends_count;
	}
	public int getStatuses_count() {
		return statuses_count;
	}
	public void setStatuses_count(int statuses_count) {
		this.statuses_count = statuses_count;
	}
	public int getFavourites_count() {
		return favourites_count;
	}
	public void setFavourites_count(int favourites_count) {
		this.favourites_count = favourites_count;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getFollowing() {
		return following;
	}
	public void setFollowing(String following) {
		this.following = following;
	}
	public String getAllow_all_act_msg() {
		return allow_all_act_msg;
	}
	public void setAllow_all_act_msg(String allow_all_act_msg) {
		this.allow_all_act_msg = allow_all_act_msg;
	}
	public String getGeo_enabled() {
		return geo_enabled;
	}
	public void setGeo_enabled(String geo_enabled) {
		this.geo_enabled = geo_enabled;
	}
	public String getVerified() {
		return verified;
	}
	public void setVerified(String verified) {
		this.verified = verified;
	}
	public int getVerified_type() {
		return verified_type;
	}
	public void setVerified_type(int verified_type) {
		this.verified_type = verified_type;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getPtype() {
		return ptype;
	}
	public void setPtype(int ptype) {
		this.ptype = ptype;
	}
	public String getAllow_all_comment() {
		return allow_all_comment;
	}
	public void setAllow_all_comment(String allow_all_comment) {
		this.allow_all_comment = allow_all_comment;
	}
	public String getAvatar_large() {
		return avatar_large;
	}
	public void setAvatar_large(String avatar_large) {
		this.avatar_large = avatar_large;
	}
	public String getAvatar_hd() {
		return avatar_hd;
	}
	public void setAvatar_hd(String avatar_hd) {
		this.avatar_hd = avatar_hd;
	}
	public String getVerified_reason() {
		return verified_reason;
	}
	public void setVerified_reason(String verified_reason) {
		this.verified_reason = verified_reason;
	}
	public String getVerified_trade() {
		return verified_trade;
	}
	public void setVerified_trade(String verified_trade) {
		this.verified_trade = verified_trade;
	}
	public String getVerified_reason_url() {
		return verified_reason_url;
	}
	public void setVerified_reason_url(String verified_reason_url) {
		this.verified_reason_url = verified_reason_url;
	}
	public String getVerified_source() {
		return verified_source;
	}
	public void setVerified_source(String verified_source) {
		this.verified_source = verified_source;
	}
	public String getVerified_source_url() {
		return verified_source_url;
	}
	public void setVerified_source_url(String verified_source_url) {
		this.verified_source_url = verified_source_url;
	}
	public String getFollow_me() {
		return follow_me;
	}
	public void setFollow_me(String follow_me) {
		this.follow_me = follow_me;
	}
	public int getOnline_status() {
		return online_status;
	}
	public void setOnline_status(int online_status) {
		this.online_status = online_status;
	}
	public int getBi_followers_count() {
		return bi_followers_count;
	}
	public void setBi_followers_count(int bi_followers_count) {
		this.bi_followers_count = bi_followers_count;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public int getStar() {
		return star;
	}
	public void setStar(int star) {
		this.star = star;
	}
	public int getMbtype() {
		return mbtype;
	}
	public void setMbtype(int mbtype) {
		this.mbtype = mbtype;
	}
	public int getMbrank() {
		return mbrank;
	}
	public void setMbrank(int mbrank) {
		this.mbrank = mbrank;
	}
	public int getBlock_word() {
		return block_word;
	}
	public void setBlock_word(int block_word) {
		this.block_word = block_word;
	}
	public int getBlock_app() {
		return block_app;
	}
	public void setBlock_app(int block_app) {
		this.block_app = block_app;
	}
	public int getWorldcup_guess() {
		return worldcup_guess;
	}
	public void setWorldcup_guess(int worldcup_guess) {
		this.worldcup_guess = worldcup_guess;
	}
	
	

}
