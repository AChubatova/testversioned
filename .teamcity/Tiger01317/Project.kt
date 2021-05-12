package Tiger01317

import Tiger01317.buildTypes.*
import Tiger01317.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01317")
    name = "Tiger01317"

    vcsRoot(Tiger01317_cVCSroot)

    buildType(Tiger01317_Hi0)
    buildType(Tiger01317_Hi2)
    buildType(Tiger01317_Hi1)
    buildType(Tiger01317_Hi3)
})
