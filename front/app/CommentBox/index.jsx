var React = require("react");

var CommentBox = React.createClass({
    render: function() {
        return (
            <div className="commentBox">
                Hello, world!
                <CommentList />
                <CommentForm />
            </div>
        );
    }
});
