package Tiger01834

import Tiger01834.buildTypes.*
import Tiger01834.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01834")
    name = "Tiger01834"

    vcsRoot(Tiger01834_cVCSroot)

    buildType(Tiger01834_Hi3)
    buildType(Tiger01834_Hi2)
    buildType(Tiger01834_Hi1)
    buildType(Tiger01834_Hi0)
})
