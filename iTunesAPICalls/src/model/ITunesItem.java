package model;

//The object that iTunes API response in the list
public class ITunesItem {

	String wrapperType;
	String kind;
	int artistId;
	int collectionId;
	int trackId;
	String artistName;
	String collectionName;
	String trackName;
	String collectionCensoredName;
	String trackCensoredName;
	String artistViewUrl;
	String collectionViewUrl;
	String trackViewUrl;
	String previewUrl;
	String artworkUrl60;
	String artworkUrl100;
	String collectionPrice;
	String trackPrice;
	String collectionExplicitness;
	String trackExplicitness;
	int discCount;
	int discNumber;
	int trackCount;
	int trackNumber;
	int trackTimeMillis;
	String country;
	String currency;
	String primaryGenreName;
	
	ITunesItem()
	{
		
	}
	
	public String getWrapperType() {
		return wrapperType;
	}
	public void setWrapperType(String wrapperType) {
		this.wrapperType = wrapperType;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getArtistId() {
		return artistId;
	}
	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}
	public int getCollectionId() {
		return collectionId;
	}
	public void setCollectionId(int collectionId) {
		this.collectionId = collectionId;
	}
	public int getTrackId() {
		return trackId;
	}
	public void setTrackId(int trackId) {
		this.trackId = trackId;
	}
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public String getCollectionName() {
		return collectionName;
	}
	public void setCollectionName(String collectionName) {
		this.collectionName = collectionName;
	}
	public String getTrackName() {
		return trackName;
	}
	public void setTrackName(String trackName) {
		this.trackName = trackName;
	}
	public String getCollectionCensoredName() {
		return collectionCensoredName;
	}
	public void setCollectionCensoredName(String collectionCensoredName) {
		this.collectionCensoredName = collectionCensoredName;
	}
	public String getTrackCensoredName() {
		return trackCensoredName;
	}
	public void setTrackCensoredName(String trackCensoredName) {
		this.trackCensoredName = trackCensoredName;
	}
	public String getArtistViewUrl() {
		return artistViewUrl;
	}
	public void setArtistViewUrl(String artistViewUrl) {
		this.artistViewUrl = artistViewUrl;
	}
	public String getCollectionViewUrl() {
		return collectionViewUrl;
	}
	public void setCollectionViewUrl(String collectionViewUrl) {
		this.collectionViewUrl = collectionViewUrl;
	}
	public String getTrackViewUrl() {
		return trackViewUrl;
	}
	public void setTrackViewUrl(String trackViewUrl) {
		this.trackViewUrl = trackViewUrl;
	}
	public String getPreviewUrl() {
		return previewUrl;
	}
	public void setPreviewUrl(String previewUrl) {
		this.previewUrl = previewUrl;
	}
	public String getArtworkUrl60() {
		return artworkUrl60;
	}
	public void setArtworkUrl60(String artworkUrl60) {
		this.artworkUrl60 = artworkUrl60;
	}
	public String getArtworkUrl100() {
		return artworkUrl100;
	}
	public void setArtworkUrl100(String artworkUrl100) {
		this.artworkUrl100 = artworkUrl100;
	}
	public String getCollectionPrice() {
		return collectionPrice;
	}
	public void setCollectionPrice(String collectionPrice) {
		this.collectionPrice = collectionPrice;
	}
	public String getTrackPrice() {
		return trackPrice;
	}
	public void setTrackPrice(String trackPrice) {
		this.trackPrice = trackPrice;
	}
	public String getCollectionExplicitness() {
		return collectionExplicitness;
	}
	public void setCollectionExplicitness(String collectionExplicitness) {
		this.collectionExplicitness = collectionExplicitness;
	}
	public String getTrackExplicitness() {
		return trackExplicitness;
	}
	public void setTrackExplicitness(String trackExplicitness) {
		this.trackExplicitness = trackExplicitness;
	}
	public int getDiscCount() {
		return discCount;
	}
	public void setDiscCount(int discCount) {
		this.discCount = discCount;
	}
	public int getDiscNumber() {
		return discNumber;
	}
	public void setDiscNumber(int discNumber) {
		this.discNumber = discNumber;
	}
	public int getTrackCount() {
		return trackCount;
	}
	public void setTrackCount(int trackCount) {
		this.trackCount = trackCount;
	}
	public int getTrackNumber() {
		return trackNumber;
	}
	public void setTrackNumber(int trackNumber) {
		this.trackNumber = trackNumber;
	}
	public int getTrackTimeMillis() {
		return trackTimeMillis;
	}
	public void setTrackTimeMillis(int trackTimeMillis) {
		this.trackTimeMillis = trackTimeMillis;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getPrimaryGenreName() {
		return primaryGenreName;
	}
	public void setPrimaryGenreName(String primaryGenreName) {
		this.primaryGenreName = primaryGenreName;
	}
	
	@Override
	public String toString() {
		return "ITunesItem [wrapperType=" + wrapperType + ", kind=" + kind + ", artistId=" + artistId
				+ ", collectionId=" + collectionId + ", trackId=" + trackId + ", artistName=" + artistName
				+ ", collectionName=" + collectionName + ", trackName=" + trackName + ", collectionCensoredName="
				+ collectionCensoredName + ", trackCensoredName=" + trackCensoredName + ", artistViewUrl="
				+ artistViewUrl + ", collectionViewUrl=" + collectionViewUrl + ", trackViewUrl=" + trackViewUrl
				+ ", previewUrl=" + previewUrl + ", artworkUrl60=" + artworkUrl60 + ", artworkUrl100=" + artworkUrl100
				+ ", collectionPrice=" + collectionPrice + ", trackPrice=" + trackPrice + ", collectionExplicitness="
				+ collectionExplicitness + ", trackExplicitness=" + trackExplicitness + ", discCount=" + discCount
				+ ", discNumber=" + discNumber + ", trackCount=" + trackCount + ", trackNumber=" + trackNumber
				+ ", trackTimeMillis=" + trackTimeMillis + ", country=" + country + ", currency=" + currency
				+ ", primaryGenreName=" + primaryGenreName + "]";
	}
}
