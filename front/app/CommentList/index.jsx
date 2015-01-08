var React = require('react');

var CommentList = React.createClass({
    render: function() {
        return (
            <div className="commentList">
                Hello, world! Commment list.
                <Comment author="Pete Hunt">Comment 1</Comment>
                <Comment author="Jordan Walke">Comment 2</Comment>
            </div>
        );
    }
});

module.exports = CommentList;
